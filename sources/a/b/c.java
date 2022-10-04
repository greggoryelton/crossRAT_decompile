package a.b;

import java.util.Iterator;

// This class does some enumeration on Linux OS'
/* loaded from: hmar6.jar:a/b/c.class */
public enum c {
    ALPINE("Alpine Linux", "alpine", new f("/etc/arch-release")),
    ANTERGOS("Antergos", new Object[0]),
    ARCH_LINUX("Arch Linux", "archlinux", "archarm"),
    BLAG("BLAG", new Object[0]),
    CHAKRA("Chakra", new f("/etc/chakra-release")),
    CENTOS("CentOS", new f("/etc/centos-release"), new e("/etc/redhat-release", "CentOS")),
    CRUNCHBANG("Crunchbang", new f("/etc/crunchbang-lsb-release"), new f("/etc/lsb-release-crunchbang")),
    DEBIAN("Debian", new Object[0]),
    RASPBIAN("Raspbian", new e("/etc/os-release", "Raspbian")),
    ELEMENTARY_OS("elementary OS", "elementary"),
    EVOLVE_OS("Evolve OS", "EvolveOS", new f("/etc/evolveos-release")),
    KAOS("KaOS", "kaos"),
    FEDORA("Fedora", new e("/etc/fedora-release", "fedora")),
    FRUGALWARE("Frugalware", new Object[0]),
    FUNTOO("Funtoo", new e("/etc/gentoo-release", "funtoo"), new h(new String[]{"lsb_release", "-sd"}, "funtoo") { // from class: a.b.a

        /* renamed from: a  reason: collision with root package name */
        private String[] f6a;

        /* renamed from: b  reason: collision with root package name */
        private String f7b;

        {
            this.f6a = r4;
            this.f7b = r5;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [boolean, java.lang.Exception] */
        @Override // a.b.h
        public final boolean a() {
            ?? hasNext;
            try {
                Iterator it = crossrat.e.a(this.f6a).iterator();
                do {
                    hasNext = it.hasNext();
                    if (hasNext == 0) {
                        return false;
                    }
                } while (!((String) it.next()).toLowerCase().contains(this.f7b.toLowerCase()));
                return true;
            } catch (Exception e) {
                hasNext.printStackTrace();
                return false;
            }
        }
    }),
    GENTOO("Gentoo", new e("/etc/gentoo-release", "gentoo")),
    JIYUU("Jiyuu", "Jiyuu"),
    DEEPIN("Deepin", "LinuxDeepin", new e("/etc/issue/", "LinuxDeepin")),
    KALI("Kali Linux", "Kali", "Debian Kali Linux"),
    KORORA("Korora", new e("/etc/fedora-release", "korora")),
    MAGEIA("Mageia", new f("/etc/mageia-release")),
    MANDRIVA("Mandriva", "MandrivaLinux", new f("/etc/mandriva-release")),
    MANDRAKE("Mandrake", new f("/etc/mandrake-release")),
    MANJARO("Manjaro", "ManjaroLinux"),
    MINT("Linux Mint", "LinuxMint", "mint"),
    NIXOS("NixOS", new f("/etc/NIXOS")),
    LMDE("LMDE", new Object[0]),
    LUNAR("Lunar Linux", "Lunar"),
    OPENSUSE("openSUSE", "SUSE LINUX", "openSUSE project", new f("/etc/SuSE-release")),
    PARABOLA("Parabola", "Parabola GNU/Linux-libre", new e("/etc/issue", "Parabola GNU/Linux-libre")),
    PEPPERMINT("Peppermint", new Object[0]),
    REDHAT_ENTERPRISE("Redhat Enterprise", "RedHatEnterprise", new e("/etc/redhat-release", "Red Hat")),
    SABAYON("Sabayon", new f("/etc/sabayon-edition")),
    SCIENTIFICLINUX("Scientific Linux", new e("/etc/system-release", "Scientific Linux")),
    SLACKWARE("Slackware", new f("/etc/slackware-version")),
    SOLUSOS("SolusOS", new e("/etc/issue", "SolusOS")),
    STEAMOS("SteamOS", "steam"),
    TINYCORE("TinyCore", new f("/usr/share/doc/tc/release.txt")),
    TRISQUEL("Trisquel", new Object[0]),
    UBUNTU("Ubuntu", new Object[0]),
    VIPERR("Viperr", new Object[0]),
    CRUX("Crux", new h("crux") { // from class: a.b.b

        /* renamed from: a  reason: collision with root package name */
        private String f8a;

        {
            this.f8a = r4;
        }

        @Override // a.b.h
        public final boolean a() {
            Exception exc;
            try {
                crossrat.e.a(new String[]{this.f8a});
                return true;
            } catch (Exception e) {
                exc.printStackTrace();
                return false;
            }
        }
    }),
    GNEWSENSE("gNewSense", new e("/etc/issue", "gNewSense")),
    DRAGORA("Dragora", new f("/etc/dragora-version")),
    CHAPEAU("Chapeau", new Object[0]),
    KDE_NEON("neon", "KDE neon"),
    ORACLE_LINUX("Oracle Linux", "ol", "Ol", new f("/etc/oracle-release"), new e("/etc/system-release", "Oracle Linux")),
    QUBES("Qubes", new f("/etc/qubes-rpc")),
    UNKNOWN("Unknown", new Object[0]);
    
    private String X;
    private Object[] Y;

    c(String str, Object... objArr) {
        this.X = str;
        this.Y = objArr;
    }

    public final Object[] a() {
        return this.Y;
    }

    public final String b() {
        return this.X;
    }

    public final String c() {
        return this == UNKNOWN ? "Unknown Linux" : !this.X.toLowerCase().contains("linux") ? String.valueOf(this.X) + " Linux" : this.X;
    }

    public static d d() {
        return crossrat.e.d();
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static c[] valuesCustom() {
        c[] cVarArr = new c[49];
        System.arraycopy(values(), 0, cVarArr, 0, 49);
        return cVarArr;
    }
}
