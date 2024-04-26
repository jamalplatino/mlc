package ai.mlc.mlcllm;

import org.apache.tvm.Device;
import org.apache.tvm.Function;
import org.apache.tvm.Module;

public class ChatModule {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Function decodeFunc = this.llmChat.getFunction("decode");
    private Function getMessage = this.llmChat.getFunction("get_message");
    private Module llmChat;
    private Function prefillFunc = this.llmChat.getFunction("prefill");
    private Function reloadFunc;
    private Function resetChatFunc = this.llmChat.getFunction("reset_chat");
    private Function runtimeStatsTextFunc = this.llmChat.getFunction("runtime_stats_text");
    private Function stoppedFunc = this.llmChat.getFunction("stopped");
    private Function unloadFunc = this.llmChat.getFunction("unload");

    public ChatModule() {
        Module asModule = Function.getFunction("mlc.llm_chat_create").pushArg(Device.opencl().deviceType).pushArg(0).invoke().asModule();
        this.llmChat = asModule;
        this.reloadFunc = asModule.getFunction("reload");
    }

    public void unload() {
        this.unloadFunc.invoke();
    }

    public void reload(String str, String str2) {
        Function pushArg = this.reloadFunc.pushArg(Function.getFunction("runtime.SystemLib").pushArg(str.replace('-', '_') + "_").invoke().asModule()).pushArg(str2);
        this.reloadFunc = pushArg;
        pushArg.invoke();
    }

    public void resetChat() {
        this.resetChatFunc.invoke();
    }

    public void prefill(String str) {
        this.prefillFunc.pushArg(str).invoke();
    }

    public String getMessage() {
        return this.getMessage.invoke().asString();
    }

    public String runtimeStatsText() {
        return this.runtimeStatsTextFunc.invoke().asString();
    }

    public void evaluate() {
        this.llmChat.getFunction("evaluate").invoke();
    }

    public boolean stopped() {
        return this.stoppedFunc.invoke().asLong() != 0;
    }

    public void decode() {
        this.decodeFunc.invoke();
    }
}
