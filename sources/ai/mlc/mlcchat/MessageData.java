package ai.mlc.mlcchat;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lai/mlc/mlcchat/MessageData;", "", "role", "Lai/mlc/mlcchat/MessageRole;", "text", "", "id", "Ljava/util/UUID;", "(Lai/mlc/mlcchat/MessageRole;Ljava/lang/String;Ljava/util/UUID;)V", "getId", "()Ljava/util/UUID;", "getRole", "()Lai/mlc/mlcchat/MessageRole;", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AppViewModel.kt */
public final class MessageData {
    public static final int $stable = 8;
    private final UUID id;
    private final MessageRole role;
    private final String text;

    public static /* synthetic */ MessageData copy$default(MessageData messageData, MessageRole messageRole, String str, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            messageRole = messageData.role;
        }
        if ((i & 2) != 0) {
            str = messageData.text;
        }
        if ((i & 4) != 0) {
            uuid = messageData.id;
        }
        return messageData.copy(messageRole, str, uuid);
    }

    public final MessageRole component1() {
        return this.role;
    }

    public final String component2() {
        return this.text;
    }

    public final UUID component3() {
        return this.id;
    }

    public final MessageData copy(MessageRole messageRole, String str, UUID uuid) {
        Intrinsics.checkNotNullParameter(messageRole, "role");
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(uuid, "id");
        return new MessageData(messageRole, str, uuid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageData)) {
            return false;
        }
        MessageData messageData = (MessageData) obj;
        return this.role == messageData.role && Intrinsics.areEqual((Object) this.text, (Object) messageData.text) && Intrinsics.areEqual((Object) this.id, (Object) messageData.id);
    }

    public final UUID getId() {
        return this.id;
    }

    public final MessageRole getRole() {
        return this.role;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((this.role.hashCode() * 31) + this.text.hashCode()) * 31) + this.id.hashCode();
    }

    public String toString() {
        return "MessageData(role=" + this.role + ", text=" + this.text + ", id=" + this.id + ')';
    }

    public MessageData(MessageRole messageRole, String str, UUID uuid) {
        Intrinsics.checkNotNullParameter(messageRole, "role");
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(uuid, "id");
        this.role = messageRole;
        this.text = str;
        this.id = uuid;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MessageData(ai.mlc.mlcchat.MessageRole r1, java.lang.String r2, java.util.UUID r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L_0x000e
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r4 = "randomUUID()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
        L_0x000e:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.mlc.mlcchat.MessageData.<init>(ai.mlc.mlcchat.MessageRole, java.lang.String, java.util.UUID, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
