package org.apache.tvm.contrib;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.tvm.Device;
import org.apache.tvm.Function;
import org.apache.tvm.Module;

public class GraphExecutor {
    public static GraphModule create(String str, Module module, Device device) {
        Function function = Function.getFunction("tvm.graph_executor.create");
        if (function != null) {
            return new GraphModule(function.pushArg(str).pushArg(module).pushArg(device.deviceType).pushArg(device.deviceId).invoke().asModule(), device);
        }
        throw new RuntimeException("Cannot find global function tvm.graph_executor.create.Did you compile tvm_runtime with correct version?");
    }

    private static Object reflectionGetField(Object obj, String str) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Object reflectionStaticCall(Class<?> cls, String str, Object... objArr) {
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke((Object) null, objArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
