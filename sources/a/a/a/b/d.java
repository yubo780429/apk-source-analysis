package a.a.a.b;

import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.baidu.location.Jni;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d extends a.a.a.i.g {
    public boolean A;
    public boolean B;
    public double C;
    public double D;
    public int E;
    public int F;
    public String G;
    public int H;
    public String I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean i;
    public long j;
    public Handler k;
    public String l;
    public int[] m;
    public double n;
    public double o;
    public float[] p;
    public float[] q;
    public float[] r;
    public float[] s;
    public float[] t;
    public float[] u;
    public ArrayList<ArrayList<Float>> v;
    public ArrayList<ArrayList<Double>> w;
    public boolean x;
    public boolean y;
    public boolean z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 17) {
                ExecutorService executorServiceB = w.d().b();
                d dVar = d.this;
                if (executorServiceB != null) {
                    dVar.a(executorServiceB, a.a.a.i.d.f325c);
                } else {
                    dVar.a(a.a.a.i.d.f325c);
                }
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f16a = new d(null);
    }

    public d() {
        this.i = false;
        this.j = 0L;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = 0.0d;
        this.o = 0.0d;
        this.p = new float[]{0.0f};
        this.q = new float[]{0.0f};
        this.r = new float[]{0.0f};
        this.s = new float[]{0.0f};
        this.t = new float[]{0.0f};
        this.u = new float[]{0.0f};
        this.v = null;
        this.w = null;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = 1.0d;
        this.D = 1.0d;
        this.E = 0;
        this.F = 0;
        this.G = "";
        this.H = 0;
        this.I = "1,1,300,4,30,10,5,10";
        this.J = 1;
        this.K = 30;
        this.L = 64;
        this.M = 1;
        this.N = 0;
        this.j = r.a().a("vdrtt", 0L);
        this.l = r.a().a("mapcity", (String) null);
    }

    public /* synthetic */ d(a aVar) {
        this();
    }

    public static d i() {
        return b.f16a;
    }

    @Override // a.a.a.i.g
    public void a() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("&sdk=");
        stringBuffer.append(9.521f);
        stringBuffer.append("&stp=1");
        if (a.a.a.i.b.e().f321c == null) {
            stringBuffer.append("&im=");
            str = a.a.a.i.b.e().f319a;
        } else {
            stringBuffer.append("&cu=");
            str = a.a.a.i.b.e().f321c;
        }
        stringBuffer.append(str);
        stringBuffer.append("&mb=");
        stringBuffer.append(Build.MODEL);
        stringBuffer.append("&abtest=1");
        stringBuffer.append("&fixa9=2");
        stringBuffer.append("&sv=");
        String strSubstring = Build.VERSION.RELEASE;
        if (strSubstring != null && strSubstring.length() > 10) {
            strSubstring = strSubstring.substring(0, 10);
        }
        stringBuffer.append(strSubstring);
        stringBuffer.append("&os=");
        int i = Build.VERSION.SDK_INT;
        stringBuffer.append(i);
        stringBuffer.append("&pack=");
        stringBuffer.append(a.a.a.i.b.f);
        stringBuffer.append("&city=");
        stringBuffer.append(this.l);
        stringBuffer.append("&locmode=");
        stringBuffer.append(a.a.a.i.i.c(com.baidu.location.f.c()));
        stringBuffer.append("&locper=");
        stringBuffer.append(a.a.a.i.i.a(com.baidu.location.f.c(), "android.permission.ACCESS_FINE_LOCATION"));
        if (this.o > 0.10000000149011612d && this.n > 0.10000000149011612d) {
            stringBuffer.append("&x=");
            stringBuffer.append(this.o);
            stringBuffer.append("&y=");
            stringBuffer.append(this.n);
        }
        stringBuffer.append("&selftest=");
        stringBuffer.append(0);
        if (i > 25) {
            stringBuffer.append("&rpmmc=");
            stringBuffer.append("0");
        }
        if (this.d == null) {
            this.d = new HashMap();
        }
        Map<String, Object> map = this.d;
        if (map != null) {
            map.clear();
            this.d.put("it", Jni.a(stringBuffer.toString()));
            this.d.put("qt", "vdr");
        }
    }

    public void a(double d, double d2) {
        this.n = d;
        this.o = d2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    @Override // a.a.a.i.g
    public void a(boolean z) {
        String str;
        if (z && (str = this.f339c) != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("data")) {
                    String string = jSONObject.getString("data");
                    r.a().b("vdrconfig", "");
                    r.a().b("vdrconfig_gz", string);
                    b(true);
                } else if (!this.i) {
                    h();
                    this.i = true;
                }
            } catch (Exception unused) {
                if (!this.i) {
                    h();
                    this.i = true;
                }
            }
        } else if (!this.i) {
            h();
            this.i = true;
        }
        Map<String, Object> map = this.d;
        if (map != null) {
            map.clear();
        }
    }

    public final void b() {
        String[] strArrSplit = "1|0|300|80|2|300|80|2|100|40|30|3|8|4050|5|5|0.1|1|1|0|0.325|0.15|3|0.5|1|6|15|10|0.05|10|10|1|5|10|10|30|5|5.5|1|0|1|40|0.5|120|180|20|200|300|600|2|10|2|4|1.02|2|0|20|10|60|2|100|2|10|1|20|0|0.2|0|0|0.5|0|1|1000|10|1|40|5|10|5|0.8|1|5.0|50|6.0|2.0|4.0|1|1|0|0|1|0.5|1|0.0|1|200|100|1|8|5|25|20|1|70.0|110.0|300|1|15|1.0".split("\\|");
        this.p = new float[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.p[i] = Float.parseFloat(strArrSplit[i]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:455:0x082a A[Catch: Exception -> 0x0fb6, TryCatch #11 {Exception -> 0x0fb6, blocks: (B:12:0x0055, B:14:0x0060, B:15:0x0063, B:19:0x006e, B:21:0x0079, B:23:0x0085, B:25:0x008b, B:27:0x0093, B:28:0x009f, B:30:0x00a5, B:31:0x00aa, B:33:0x00b2, B:34:0x00b8, B:36:0x00c0, B:37:0x00c6, B:39:0x00ce, B:40:0x00d4, B:42:0x00dc, B:43:0x00e3, B:45:0x00eb, B:46:0x00f2, B:48:0x00fa, B:49:0x0100, B:51:0x0108, B:52:0x010e, B:54:0x0116, B:55:0x011c, B:57:0x0124, B:58:0x012b, B:60:0x0134, B:61:0x0139, B:63:0x0141, B:64:0x0147, B:66:0x014f, B:169:0x037d, B:171:0x0385, B:172:0x038a, B:174:0x0392, B:175:0x0397, B:177:0x039f, B:178:0x03a4, B:180:0x03ac, B:181:0x03b1, B:183:0x03b9, B:184:0x03be, B:186:0x03c6, B:187:0x03cb, B:189:0x03d3, B:190:0x03d8, B:192:0x03e0, B:193:0x03e5, B:195:0x03ed, B:196:0x03f2, B:198:0x03fa, B:199:0x03ff, B:201:0x0407, B:202:0x040c, B:204:0x0414, B:205:0x0419, B:207:0x0421, B:208:0x0428, B:210:0x0430, B:211:0x0435, B:213:0x043d, B:214:0x0442, B:216:0x044a, B:217:0x044f, B:219:0x0457, B:220:0x045c, B:222:0x0464, B:223:0x0469, B:225:0x0471, B:226:0x0476, B:228:0x047e, B:229:0x0483, B:231:0x048b, B:232:0x0490, B:234:0x0498, B:235:0x049d, B:237:0x04a5, B:238:0x04aa, B:240:0x04b2, B:241:0x04b7, B:243:0x04bf, B:244:0x04c4, B:246:0x04cc, B:247:0x04d1, B:249:0x04d9, B:250:0x04de, B:252:0x04e6, B:253:0x04eb, B:255:0x04f3, B:256:0x04f8, B:258:0x0500, B:259:0x0505, B:261:0x050d, B:262:0x0512, B:264:0x051a, B:265:0x051f, B:267:0x0527, B:268:0x052c, B:270:0x0534, B:271:0x0539, B:273:0x0541, B:274:0x0546, B:276:0x054e, B:277:0x0553, B:279:0x055b, B:280:0x0560, B:282:0x0568, B:283:0x056d, B:285:0x0575, B:286:0x057a, B:288:0x0582, B:289:0x0587, B:291:0x058f, B:292:0x0594, B:294:0x059c, B:295:0x05a1, B:297:0x05a9, B:298:0x05ae, B:300:0x05b6, B:301:0x05bb, B:303:0x05c1, B:304:0x05c4, B:306:0x05cc, B:307:0x05d1, B:309:0x05d9, B:310:0x05de, B:312:0x05e4, B:313:0x05e7, B:315:0x05ed, B:316:0x05f0, B:318:0x05f8, B:319:0x05fd, B:321:0x0603, B:322:0x0606, B:324:0x060e, B:325:0x0613, B:327:0x061b, B:328:0x0620, B:330:0x0628, B:331:0x062d, B:333:0x0633, B:334:0x0636, B:336:0x063c, B:337:0x063f, B:339:0x0647, B:340:0x064a, B:342:0x0652, B:343:0x0655, B:345:0x065d, B:346:0x0660, B:348:0x0668, B:349:0x066b, B:351:0x0675, B:352:0x067a, B:354:0x0682, B:355:0x0687, B:357:0x068f, B:358:0x0694, B:360:0x069c, B:361:0x06a1, B:363:0x06a9, B:364:0x06ae, B:366:0x06b6, B:367:0x06bb, B:369:0x06c3, B:370:0x06c8, B:372:0x06d0, B:373:0x06d5, B:375:0x06dd, B:376:0x06e2, B:378:0x06ea, B:379:0x06ef, B:381:0x06f7, B:382:0x06fc, B:384:0x0704, B:385:0x0709, B:387:0x0711, B:388:0x0716, B:390:0x071e, B:391:0x0723, B:393:0x072b, B:394:0x0730, B:396:0x0738, B:397:0x073d, B:399:0x0745, B:400:0x074a, B:402:0x0752, B:403:0x0757, B:405:0x075f, B:406:0x0764, B:408:0x076c, B:409:0x0771, B:411:0x0779, B:412:0x077e, B:415:0x078b, B:422:0x079e, B:425:0x07ac, B:428:0x07ba, B:431:0x07c4, B:433:0x07d0, B:434:0x07d2, B:437:0x07e0, B:440:0x07ee, B:442:0x07f6, B:444:0x0802, B:446:0x0808, B:447:0x0814, B:449:0x0817, B:454:0x0827, B:456:0x082f, B:458:0x0837, B:460:0x0843, B:462:0x0849, B:463:0x0853, B:465:0x0856, B:470:0x0866, B:472:0x086c, B:474:0x0874, B:476:0x0880, B:478:0x0886, B:479:0x0890, B:481:0x0893, B:486:0x08a3, B:488:0x08a9, B:490:0x08b1, B:492:0x08bd, B:494:0x08c3, B:495:0x08cd, B:497:0x08d0, B:502:0x08e0, B:504:0x08e6, B:506:0x08ee, B:508:0x08fa, B:510:0x0900, B:511:0x090a, B:513:0x090d, B:518:0x091d, B:520:0x0923, B:522:0x092b, B:524:0x0937, B:526:0x093d, B:527:0x0947, B:529:0x094a, B:534:0x095a, B:536:0x0960, B:538:0x0968, B:540:0x0970, B:542:0x0976, B:544:0x0984, B:548:0x09a7, B:550:0x09af, B:552:0x09bb, B:553:0x09be, B:555:0x09c4, B:556:0x09c7, B:558:0x09cd, B:559:0x09d0, B:561:0x09d6, B:562:0x09d9, B:564:0x09df, B:565:0x09e2, B:567:0x09e8, B:568:0x09eb, B:570:0x09f1, B:571:0x09f4, B:573:0x09fc, B:574:0x09ff, B:576:0x0a07, B:577:0x0a0a, B:579:0x0a12, B:580:0x0a15, B:582:0x0a1d, B:584:0x0a2b, B:585:0x0a30, B:587:0x0a38, B:588:0x0a3d, B:590:0x0a45, B:591:0x0a4a, B:593:0x0a52, B:594:0x0a57, B:596:0x0a5f, B:597:0x0a64, B:599:0x0a6c, B:600:0x0a71, B:602:0x0a79, B:603:0x0a7e, B:605:0x0a86, B:606:0x0a8b, B:608:0x0a93, B:609:0x0a98, B:623:0x0afe, B:645:0x0b8a, B:647:0x0b92, B:648:0x0b97, B:650:0x0b9f, B:651:0x0ba4, B:653:0x0bac, B:654:0x0bb1, B:656:0x0bb9, B:657:0x0bbe, B:659:0x0bc6, B:660:0x0bcb, B:662:0x0bd3, B:663:0x0bd8, B:665:0x0be0, B:666:0x0be5, B:668:0x0bed, B:669:0x0bf2, B:671:0x0bfa, B:672:0x0bff, B:674:0x0c07, B:675:0x0c0c, B:677:0x0c14, B:678:0x0c19, B:680:0x0c21, B:681:0x0c26, B:683:0x0c2e, B:684:0x0c33, B:686:0x0c3b, B:687:0x0c40, B:689:0x0c48, B:690:0x0c4d, B:692:0x0c55, B:693:0x0c5a, B:695:0x0c62, B:696:0x0c67, B:698:0x0c6f, B:699:0x0c74, B:701:0x0c7c, B:702:0x0c81, B:704:0x0c89, B:705:0x0c8e, B:707:0x0c96, B:708:0x0c9b, B:710:0x0ca3, B:711:0x0ca9, B:713:0x0cb1, B:714:0x0cb8, B:716:0x0cc0, B:717:0x0cc9, B:719:0x0cd1, B:720:0x0cd8, B:722:0x0ce0, B:723:0x0ce7, B:725:0x0cef, B:726:0x0cf4, B:728:0x0cfc, B:729:0x0d01, B:731:0x0d09, B:732:0x0d0e, B:734:0x0d16, B:735:0x0d1b, B:737:0x0d23, B:738:0x0d29, B:740:0x0d31, B:741:0x0d38, B:743:0x0d40, B:744:0x0d46, B:746:0x0d4e, B:747:0x0d54, B:749:0x0d5c, B:750:0x0d62, B:752:0x0d6a, B:758:0x0d98, B:760:0x0da0, B:761:0x0da5, B:763:0x0dad, B:764:0x0db2, B:766:0x0dba, B:767:0x0dc0, B:769:0x0dc8, B:770:0x0dcf, B:772:0x0dd7, B:773:0x0ddd, B:775:0x0de5, B:776:0x0dea, B:778:0x0df2, B:779:0x0df8, B:781:0x0e00, B:782:0x0e05, B:784:0x0e0d, B:785:0x0e14, B:787:0x0e1c, B:788:0x0e22, B:790:0x0e2a, B:791:0x0e30, B:793:0x0e38, B:794:0x0e42, B:796:0x0e4a, B:797:0x0e54, B:799:0x0e5c, B:800:0x0e62, B:802:0x0e6a, B:803:0x0e6f, B:805:0x0e77, B:806:0x0e7c, B:808:0x0e84, B:809:0x0e89, B:811:0x0e91, B:812:0x0e96, B:814:0x0e9e, B:815:0x0ea4, B:817:0x0eac, B:818:0x0eb5, B:820:0x0ebd, B:821:0x0ec7, B:823:0x0ecf, B:824:0x0ed9, B:826:0x0ee1, B:827:0x0ee7, B:829:0x0eef, B:830:0x0ef5, B:832:0x0efd, B:833:0x0f05, B:835:0x0f0d, B:836:0x0f15, B:838:0x0f1d, B:839:0x0f25, B:841:0x0f2d, B:842:0x0f32, B:844:0x0f3a, B:845:0x0f3f, B:847:0x0f47, B:849:0x0f53, B:851:0x0f5b, B:852:0x0f67, B:854:0x0f6f, B:855:0x0f74, B:857:0x0f7c, B:858:0x0f81, B:860:0x0f89, B:861:0x0f8e, B:863:0x0f96, B:864:0x0f9b, B:866:0x0fa3, B:867:0x0fa8, B:869:0x0fb0, B:644:0x0b87, B:622:0x0afb, B:533:0x0957, B:535:0x095d, B:517:0x091a, B:519:0x0920, B:501:0x08dd, B:503:0x08e3, B:485:0x08a0, B:487:0x08a6, B:469:0x0863, B:471:0x0869, B:453:0x0824, B:455:0x082a, B:168:0x037a, B:125:0x02a3, B:127:0x02ab, B:129:0x02b9, B:130:0x02be, B:132:0x02c6, B:133:0x02cb, B:135:0x02d3, B:136:0x02e3, B:138:0x02eb, B:139:0x02f0, B:141:0x02f8, B:142:0x02fd, B:144:0x0305, B:145:0x0315, B:147:0x031d, B:148:0x0322, B:150:0x032a, B:151:0x032f, B:153:0x0337, B:154:0x033f, B:156:0x0347, B:157:0x034f, B:159:0x0357, B:160:0x035e, B:162:0x0364, B:164:0x0370, B:611:0x0aa0, B:613:0x0aad, B:615:0x0ab9, B:617:0x0aea, B:618:0x0af1, B:625:0x0b06, B:627:0x0b13, B:629:0x0b19, B:631:0x0b21, B:633:0x0b29, B:635:0x0b31, B:637:0x0b39, B:639:0x0b76, B:640:0x0b7d), top: B:907:0x0055, inners: #2, #4, #8, #9, #12, #13, #16, #18, #19 }] */
    /* JADX WARN: Code duplicated, block: B:471:0x0869 A[Catch: Exception -> 0x0fb6, TryCatch #11 {Exception -> 0x0fb6, blocks: (B:12:0x0055, B:14:0x0060, B:15:0x0063, B:19:0x006e, B:21:0x0079, B:23:0x0085, B:25:0x008b, B:27:0x0093, B:28:0x009f, B:30:0x00a5, B:31:0x00aa, B:33:0x00b2, B:34:0x00b8, B:36:0x00c0, B:37:0x00c6, B:39:0x00ce, B:40:0x00d4, B:42:0x00dc, B:43:0x00e3, B:45:0x00eb, B:46:0x00f2, B:48:0x00fa, B:49:0x0100, B:51:0x0108, B:52:0x010e, B:54:0x0116, B:55:0x011c, B:57:0x0124, B:58:0x012b, B:60:0x0134, B:61:0x0139, B:63:0x0141, B:64:0x0147, B:66:0x014f, B:169:0x037d, B:171:0x0385, B:172:0x038a, B:174:0x0392, B:175:0x0397, B:177:0x039f, B:178:0x03a4, B:180:0x03ac, B:181:0x03b1, B:183:0x03b9, B:184:0x03be, B:186:0x03c6, B:187:0x03cb, B:189:0x03d3, B:190:0x03d8, B:192:0x03e0, B:193:0x03e5, B:195:0x03ed, B:196:0x03f2, B:198:0x03fa, B:199:0x03ff, B:201:0x0407, B:202:0x040c, B:204:0x0414, B:205:0x0419, B:207:0x0421, B:208:0x0428, B:210:0x0430, B:211:0x0435, B:213:0x043d, B:214:0x0442, B:216:0x044a, B:217:0x044f, B:219:0x0457, B:220:0x045c, B:222:0x0464, B:223:0x0469, B:225:0x0471, B:226:0x0476, B:228:0x047e, B:229:0x0483, B:231:0x048b, B:232:0x0490, B:234:0x0498, B:235:0x049d, B:237:0x04a5, B:238:0x04aa, B:240:0x04b2, B:241:0x04b7, B:243:0x04bf, B:244:0x04c4, B:246:0x04cc, B:247:0x04d1, B:249:0x04d9, B:250:0x04de, B:252:0x04e6, B:253:0x04eb, B:255:0x04f3, B:256:0x04f8, B:258:0x0500, B:259:0x0505, B:261:0x050d, B:262:0x0512, B:264:0x051a, B:265:0x051f, B:267:0x0527, B:268:0x052c, B:270:0x0534, B:271:0x0539, B:273:0x0541, B:274:0x0546, B:276:0x054e, B:277:0x0553, B:279:0x055b, B:280:0x0560, B:282:0x0568, B:283:0x056d, B:285:0x0575, B:286:0x057a, B:288:0x0582, B:289:0x0587, B:291:0x058f, B:292:0x0594, B:294:0x059c, B:295:0x05a1, B:297:0x05a9, B:298:0x05ae, B:300:0x05b6, B:301:0x05bb, B:303:0x05c1, B:304:0x05c4, B:306:0x05cc, B:307:0x05d1, B:309:0x05d9, B:310:0x05de, B:312:0x05e4, B:313:0x05e7, B:315:0x05ed, B:316:0x05f0, B:318:0x05f8, B:319:0x05fd, B:321:0x0603, B:322:0x0606, B:324:0x060e, B:325:0x0613, B:327:0x061b, B:328:0x0620, B:330:0x0628, B:331:0x062d, B:333:0x0633, B:334:0x0636, B:336:0x063c, B:337:0x063f, B:339:0x0647, B:340:0x064a, B:342:0x0652, B:343:0x0655, B:345:0x065d, B:346:0x0660, B:348:0x0668, B:349:0x066b, B:351:0x0675, B:352:0x067a, B:354:0x0682, B:355:0x0687, B:357:0x068f, B:358:0x0694, B:360:0x069c, B:361:0x06a1, B:363:0x06a9, B:364:0x06ae, B:366:0x06b6, B:367:0x06bb, B:369:0x06c3, B:370:0x06c8, B:372:0x06d0, B:373:0x06d5, B:375:0x06dd, B:376:0x06e2, B:378:0x06ea, B:379:0x06ef, B:381:0x06f7, B:382:0x06fc, B:384:0x0704, B:385:0x0709, B:387:0x0711, B:388:0x0716, B:390:0x071e, B:391:0x0723, B:393:0x072b, B:394:0x0730, B:396:0x0738, B:397:0x073d, B:399:0x0745, B:400:0x074a, B:402:0x0752, B:403:0x0757, B:405:0x075f, B:406:0x0764, B:408:0x076c, B:409:0x0771, B:411:0x0779, B:412:0x077e, B:415:0x078b, B:422:0x079e, B:425:0x07ac, B:428:0x07ba, B:431:0x07c4, B:433:0x07d0, B:434:0x07d2, B:437:0x07e0, B:440:0x07ee, B:442:0x07f6, B:444:0x0802, B:446:0x0808, B:447:0x0814, B:449:0x0817, B:454:0x0827, B:456:0x082f, B:458:0x0837, B:460:0x0843, B:462:0x0849, B:463:0x0853, B:465:0x0856, B:470:0x0866, B:472:0x086c, B:474:0x0874, B:476:0x0880, B:478:0x0886, B:479:0x0890, B:481:0x0893, B:486:0x08a3, B:488:0x08a9, B:490:0x08b1, B:492:0x08bd, B:494:0x08c3, B:495:0x08cd, B:497:0x08d0, B:502:0x08e0, B:504:0x08e6, B:506:0x08ee, B:508:0x08fa, B:510:0x0900, B:511:0x090a, B:513:0x090d, B:518:0x091d, B:520:0x0923, B:522:0x092b, B:524:0x0937, B:526:0x093d, B:527:0x0947, B:529:0x094a, B:534:0x095a, B:536:0x0960, B:538:0x0968, B:540:0x0970, B:542:0x0976, B:544:0x0984, B:548:0x09a7, B:550:0x09af, B:552:0x09bb, B:553:0x09be, B:555:0x09c4, B:556:0x09c7, B:558:0x09cd, B:559:0x09d0, B:561:0x09d6, B:562:0x09d9, B:564:0x09df, B:565:0x09e2, B:567:0x09e8, B:568:0x09eb, B:570:0x09f1, B:571:0x09f4, B:573:0x09fc, B:574:0x09ff, B:576:0x0a07, B:577:0x0a0a, B:579:0x0a12, B:580:0x0a15, B:582:0x0a1d, B:584:0x0a2b, B:585:0x0a30, B:587:0x0a38, B:588:0x0a3d, B:590:0x0a45, B:591:0x0a4a, B:593:0x0a52, B:594:0x0a57, B:596:0x0a5f, B:597:0x0a64, B:599:0x0a6c, B:600:0x0a71, B:602:0x0a79, B:603:0x0a7e, B:605:0x0a86, B:606:0x0a8b, B:608:0x0a93, B:609:0x0a98, B:623:0x0afe, B:645:0x0b8a, B:647:0x0b92, B:648:0x0b97, B:650:0x0b9f, B:651:0x0ba4, B:653:0x0bac, B:654:0x0bb1, B:656:0x0bb9, B:657:0x0bbe, B:659:0x0bc6, B:660:0x0bcb, B:662:0x0bd3, B:663:0x0bd8, B:665:0x0be0, B:666:0x0be5, B:668:0x0bed, B:669:0x0bf2, B:671:0x0bfa, B:672:0x0bff, B:674:0x0c07, B:675:0x0c0c, B:677:0x0c14, B:678:0x0c19, B:680:0x0c21, B:681:0x0c26, B:683:0x0c2e, B:684:0x0c33, B:686:0x0c3b, B:687:0x0c40, B:689:0x0c48, B:690:0x0c4d, B:692:0x0c55, B:693:0x0c5a, B:695:0x0c62, B:696:0x0c67, B:698:0x0c6f, B:699:0x0c74, B:701:0x0c7c, B:702:0x0c81, B:704:0x0c89, B:705:0x0c8e, B:707:0x0c96, B:708:0x0c9b, B:710:0x0ca3, B:711:0x0ca9, B:713:0x0cb1, B:714:0x0cb8, B:716:0x0cc0, B:717:0x0cc9, B:719:0x0cd1, B:720:0x0cd8, B:722:0x0ce0, B:723:0x0ce7, B:725:0x0cef, B:726:0x0cf4, B:728:0x0cfc, B:729:0x0d01, B:731:0x0d09, B:732:0x0d0e, B:734:0x0d16, B:735:0x0d1b, B:737:0x0d23, B:738:0x0d29, B:740:0x0d31, B:741:0x0d38, B:743:0x0d40, B:744:0x0d46, B:746:0x0d4e, B:747:0x0d54, B:749:0x0d5c, B:750:0x0d62, B:752:0x0d6a, B:758:0x0d98, B:760:0x0da0, B:761:0x0da5, B:763:0x0dad, B:764:0x0db2, B:766:0x0dba, B:767:0x0dc0, B:769:0x0dc8, B:770:0x0dcf, B:772:0x0dd7, B:773:0x0ddd, B:775:0x0de5, B:776:0x0dea, B:778:0x0df2, B:779:0x0df8, B:781:0x0e00, B:782:0x0e05, B:784:0x0e0d, B:785:0x0e14, B:787:0x0e1c, B:788:0x0e22, B:790:0x0e2a, B:791:0x0e30, B:793:0x0e38, B:794:0x0e42, B:796:0x0e4a, B:797:0x0e54, B:799:0x0e5c, B:800:0x0e62, B:802:0x0e6a, B:803:0x0e6f, B:805:0x0e77, B:806:0x0e7c, B:808:0x0e84, B:809:0x0e89, B:811:0x0e91, B:812:0x0e96, B:814:0x0e9e, B:815:0x0ea4, B:817:0x0eac, B:818:0x0eb5, B:820:0x0ebd, B:821:0x0ec7, B:823:0x0ecf, B:824:0x0ed9, B:826:0x0ee1, B:827:0x0ee7, B:829:0x0eef, B:830:0x0ef5, B:832:0x0efd, B:833:0x0f05, B:835:0x0f0d, B:836:0x0f15, B:838:0x0f1d, B:839:0x0f25, B:841:0x0f2d, B:842:0x0f32, B:844:0x0f3a, B:845:0x0f3f, B:847:0x0f47, B:849:0x0f53, B:851:0x0f5b, B:852:0x0f67, B:854:0x0f6f, B:855:0x0f74, B:857:0x0f7c, B:858:0x0f81, B:860:0x0f89, B:861:0x0f8e, B:863:0x0f96, B:864:0x0f9b, B:866:0x0fa3, B:867:0x0fa8, B:869:0x0fb0, B:644:0x0b87, B:622:0x0afb, B:533:0x0957, B:535:0x095d, B:517:0x091a, B:519:0x0920, B:501:0x08dd, B:503:0x08e3, B:485:0x08a0, B:487:0x08a6, B:469:0x0863, B:471:0x0869, B:453:0x0824, B:455:0x082a, B:168:0x037a, B:125:0x02a3, B:127:0x02ab, B:129:0x02b9, B:130:0x02be, B:132:0x02c6, B:133:0x02cb, B:135:0x02d3, B:136:0x02e3, B:138:0x02eb, B:139:0x02f0, B:141:0x02f8, B:142:0x02fd, B:144:0x0305, B:145:0x0315, B:147:0x031d, B:148:0x0322, B:150:0x032a, B:151:0x032f, B:153:0x0337, B:154:0x033f, B:156:0x0347, B:157:0x034f, B:159:0x0357, B:160:0x035e, B:162:0x0364, B:164:0x0370, B:611:0x0aa0, B:613:0x0aad, B:615:0x0ab9, B:617:0x0aea, B:618:0x0af1, B:625:0x0b06, B:627:0x0b13, B:629:0x0b19, B:631:0x0b21, B:633:0x0b29, B:635:0x0b31, B:637:0x0b39, B:639:0x0b76, B:640:0x0b7d), top: B:907:0x0055, inners: #2, #4, #8, #9, #12, #13, #16, #18, #19 }] */
    /* JADX WARN: Code duplicated, block: B:487:0x08a6 A[Catch: Exception -> 0x0fb6, TryCatch #11 {Exception -> 0x0fb6, blocks: (B:12:0x0055, B:14:0x0060, B:15:0x0063, B:19:0x006e, B:21:0x0079, B:23:0x0085, B:25:0x008b, B:27:0x0093, B:28:0x009f, B:30:0x00a5, B:31:0x00aa, B:33:0x00b2, B:34:0x00b8, B:36:0x00c0, B:37:0x00c6, B:39:0x00ce, B:40:0x00d4, B:42:0x00dc, B:43:0x00e3, B:45:0x00eb, B:46:0x00f2, B:48:0x00fa, B:49:0x0100, B:51:0x0108, B:52:0x010e, B:54:0x0116, B:55:0x011c, B:57:0x0124, B:58:0x012b, B:60:0x0134, B:61:0x0139, B:63:0x0141, B:64:0x0147, B:66:0x014f, B:169:0x037d, B:171:0x0385, B:172:0x038a, B:174:0x0392, B:175:0x0397, B:177:0x039f, B:178:0x03a4, B:180:0x03ac, B:181:0x03b1, B:183:0x03b9, B:184:0x03be, B:186:0x03c6, B:187:0x03cb, B:189:0x03d3, B:190:0x03d8, B:192:0x03e0, B:193:0x03e5, B:195:0x03ed, B:196:0x03f2, B:198:0x03fa, B:199:0x03ff, B:201:0x0407, B:202:0x040c, B:204:0x0414, B:205:0x0419, B:207:0x0421, B:208:0x0428, B:210:0x0430, B:211:0x0435, B:213:0x043d, B:214:0x0442, B:216:0x044a, B:217:0x044f, B:219:0x0457, B:220:0x045c, B:222:0x0464, B:223:0x0469, B:225:0x0471, B:226:0x0476, B:228:0x047e, B:229:0x0483, B:231:0x048b, B:232:0x0490, B:234:0x0498, B:235:0x049d, B:237:0x04a5, B:238:0x04aa, B:240:0x04b2, B:241:0x04b7, B:243:0x04bf, B:244:0x04c4, B:246:0x04cc, B:247:0x04d1, B:249:0x04d9, B:250:0x04de, B:252:0x04e6, B:253:0x04eb, B:255:0x04f3, B:256:0x04f8, B:258:0x0500, B:259:0x0505, B:261:0x050d, B:262:0x0512, B:264:0x051a, B:265:0x051f, B:267:0x0527, B:268:0x052c, B:270:0x0534, B:271:0x0539, B:273:0x0541, B:274:0x0546, B:276:0x054e, B:277:0x0553, B:279:0x055b, B:280:0x0560, B:282:0x0568, B:283:0x056d, B:285:0x0575, B:286:0x057a, B:288:0x0582, B:289:0x0587, B:291:0x058f, B:292:0x0594, B:294:0x059c, B:295:0x05a1, B:297:0x05a9, B:298:0x05ae, B:300:0x05b6, B:301:0x05bb, B:303:0x05c1, B:304:0x05c4, B:306:0x05cc, B:307:0x05d1, B:309:0x05d9, B:310:0x05de, B:312:0x05e4, B:313:0x05e7, B:315:0x05ed, B:316:0x05f0, B:318:0x05f8, B:319:0x05fd, B:321:0x0603, B:322:0x0606, B:324:0x060e, B:325:0x0613, B:327:0x061b, B:328:0x0620, B:330:0x0628, B:331:0x062d, B:333:0x0633, B:334:0x0636, B:336:0x063c, B:337:0x063f, B:339:0x0647, B:340:0x064a, B:342:0x0652, B:343:0x0655, B:345:0x065d, B:346:0x0660, B:348:0x0668, B:349:0x066b, B:351:0x0675, B:352:0x067a, B:354:0x0682, B:355:0x0687, B:357:0x068f, B:358:0x0694, B:360:0x069c, B:361:0x06a1, B:363:0x06a9, B:364:0x06ae, B:366:0x06b6, B:367:0x06bb, B:369:0x06c3, B:370:0x06c8, B:372:0x06d0, B:373:0x06d5, B:375:0x06dd, B:376:0x06e2, B:378:0x06ea, B:379:0x06ef, B:381:0x06f7, B:382:0x06fc, B:384:0x0704, B:385:0x0709, B:387:0x0711, B:388:0x0716, B:390:0x071e, B:391:0x0723, B:393:0x072b, B:394:0x0730, B:396:0x0738, B:397:0x073d, B:399:0x0745, B:400:0x074a, B:402:0x0752, B:403:0x0757, B:405:0x075f, B:406:0x0764, B:408:0x076c, B:409:0x0771, B:411:0x0779, B:412:0x077e, B:415:0x078b, B:422:0x079e, B:425:0x07ac, B:428:0x07ba, B:431:0x07c4, B:433:0x07d0, B:434:0x07d2, B:437:0x07e0, B:440:0x07ee, B:442:0x07f6, B:444:0x0802, B:446:0x0808, B:447:0x0814, B:449:0x0817, B:454:0x0827, B:456:0x082f, B:458:0x0837, B:460:0x0843, B:462:0x0849, B:463:0x0853, B:465:0x0856, B:470:0x0866, B:472:0x086c, B:474:0x0874, B:476:0x0880, B:478:0x0886, B:479:0x0890, B:481:0x0893, B:486:0x08a3, B:488:0x08a9, B:490:0x08b1, B:492:0x08bd, B:494:0x08c3, B:495:0x08cd, B:497:0x08d0, B:502:0x08e0, B:504:0x08e6, B:506:0x08ee, B:508:0x08fa, B:510:0x0900, B:511:0x090a, B:513:0x090d, B:518:0x091d, B:520:0x0923, B:522:0x092b, B:524:0x0937, B:526:0x093d, B:527:0x0947, B:529:0x094a, B:534:0x095a, B:536:0x0960, B:538:0x0968, B:540:0x0970, B:542:0x0976, B:544:0x0984, B:548:0x09a7, B:550:0x09af, B:552:0x09bb, B:553:0x09be, B:555:0x09c4, B:556:0x09c7, B:558:0x09cd, B:559:0x09d0, B:561:0x09d6, B:562:0x09d9, B:564:0x09df, B:565:0x09e2, B:567:0x09e8, B:568:0x09eb, B:570:0x09f1, B:571:0x09f4, B:573:0x09fc, B:574:0x09ff, B:576:0x0a07, B:577:0x0a0a, B:579:0x0a12, B:580:0x0a15, B:582:0x0a1d, B:584:0x0a2b, B:585:0x0a30, B:587:0x0a38, B:588:0x0a3d, B:590:0x0a45, B:591:0x0a4a, B:593:0x0a52, B:594:0x0a57, B:596:0x0a5f, B:597:0x0a64, B:599:0x0a6c, B:600:0x0a71, B:602:0x0a79, B:603:0x0a7e, B:605:0x0a86, B:606:0x0a8b, B:608:0x0a93, B:609:0x0a98, B:623:0x0afe, B:645:0x0b8a, B:647:0x0b92, B:648:0x0b97, B:650:0x0b9f, B:651:0x0ba4, B:653:0x0bac, B:654:0x0bb1, B:656:0x0bb9, B:657:0x0bbe, B:659:0x0bc6, B:660:0x0bcb, B:662:0x0bd3, B:663:0x0bd8, B:665:0x0be0, B:666:0x0be5, B:668:0x0bed, B:669:0x0bf2, B:671:0x0bfa, B:672:0x0bff, B:674:0x0c07, B:675:0x0c0c, B:677:0x0c14, B:678:0x0c19, B:680:0x0c21, B:681:0x0c26, B:683:0x0c2e, B:684:0x0c33, B:686:0x0c3b, B:687:0x0c40, B:689:0x0c48, B:690:0x0c4d, B:692:0x0c55, B:693:0x0c5a, B:695:0x0c62, B:696:0x0c67, B:698:0x0c6f, B:699:0x0c74, B:701:0x0c7c, B:702:0x0c81, B:704:0x0c89, B:705:0x0c8e, B:707:0x0c96, B:708:0x0c9b, B:710:0x0ca3, B:711:0x0ca9, B:713:0x0cb1, B:714:0x0cb8, B:716:0x0cc0, B:717:0x0cc9, B:719:0x0cd1, B:720:0x0cd8, B:722:0x0ce0, B:723:0x0ce7, B:725:0x0cef, B:726:0x0cf4, B:728:0x0cfc, B:729:0x0d01, B:731:0x0d09, B:732:0x0d0e, B:734:0x0d16, B:735:0x0d1b, B:737:0x0d23, B:738:0x0d29, B:740:0x0d31, B:741:0x0d38, B:743:0x0d40, B:744:0x0d46, B:746:0x0d4e, B:747:0x0d54, B:749:0x0d5c, B:750:0x0d62, B:752:0x0d6a, B:758:0x0d98, B:760:0x0da0, B:761:0x0da5, B:763:0x0dad, B:764:0x0db2, B:766:0x0dba, B:767:0x0dc0, B:769:0x0dc8, B:770:0x0dcf, B:772:0x0dd7, B:773:0x0ddd, B:775:0x0de5, B:776:0x0dea, B:778:0x0df2, B:779:0x0df8, B:781:0x0e00, B:782:0x0e05, B:784:0x0e0d, B:785:0x0e14, B:787:0x0e1c, B:788:0x0e22, B:790:0x0e2a, B:791:0x0e30, B:793:0x0e38, B:794:0x0e42, B:796:0x0e4a, B:797:0x0e54, B:799:0x0e5c, B:800:0x0e62, B:802:0x0e6a, B:803:0x0e6f, B:805:0x0e77, B:806:0x0e7c, B:808:0x0e84, B:809:0x0e89, B:811:0x0e91, B:812:0x0e96, B:814:0x0e9e, B:815:0x0ea4, B:817:0x0eac, B:818:0x0eb5, B:820:0x0ebd, B:821:0x0ec7, B:823:0x0ecf, B:824:0x0ed9, B:826:0x0ee1, B:827:0x0ee7, B:829:0x0eef, B:830:0x0ef5, B:832:0x0efd, B:833:0x0f05, B:835:0x0f0d, B:836:0x0f15, B:838:0x0f1d, B:839:0x0f25, B:841:0x0f2d, B:842:0x0f32, B:844:0x0f3a, B:845:0x0f3f, B:847:0x0f47, B:849:0x0f53, B:851:0x0f5b, B:852:0x0f67, B:854:0x0f6f, B:855:0x0f74, B:857:0x0f7c, B:858:0x0f81, B:860:0x0f89, B:861:0x0f8e, B:863:0x0f96, B:864:0x0f9b, B:866:0x0fa3, B:867:0x0fa8, B:869:0x0fb0, B:644:0x0b87, B:622:0x0afb, B:533:0x0957, B:535:0x095d, B:517:0x091a, B:519:0x0920, B:501:0x08dd, B:503:0x08e3, B:485:0x08a0, B:487:0x08a6, B:469:0x0863, B:471:0x0869, B:453:0x0824, B:455:0x082a, B:168:0x037a, B:125:0x02a3, B:127:0x02ab, B:129:0x02b9, B:130:0x02be, B:132:0x02c6, B:133:0x02cb, B:135:0x02d3, B:136:0x02e3, B:138:0x02eb, B:139:0x02f0, B:141:0x02f8, B:142:0x02fd, B:144:0x0305, B:145:0x0315, B:147:0x031d, B:148:0x0322, B:150:0x032a, B:151:0x032f, B:153:0x0337, B:154:0x033f, B:156:0x0347, B:157:0x034f, B:159:0x0357, B:160:0x035e, B:162:0x0364, B:164:0x0370, B:611:0x0aa0, B:613:0x0aad, B:615:0x0ab9, B:617:0x0aea, B:618:0x0af1, B:625:0x0b06, B:627:0x0b13, B:629:0x0b19, B:631:0x0b21, B:633:0x0b29, B:635:0x0b31, B:637:0x0b39, B:639:0x0b76, B:640:0x0b7d), top: B:907:0x0055, inners: #2, #4, #8, #9, #12, #13, #16, #18, #19 }] */
    /* JADX WARN: Code duplicated, block: B:503:0x08e3 A[Catch: Exception -> 0x0fb6, TryCatch #11 {Exception -> 0x0fb6, blocks: (B:12:0x0055, B:14:0x0060, B:15:0x0063, B:19:0x006e, B:21:0x0079, B:23:0x0085, B:25:0x008b, B:27:0x0093, B:28:0x009f, B:30:0x00a5, B:31:0x00aa, B:33:0x00b2, B:34:0x00b8, B:36:0x00c0, B:37:0x00c6, B:39:0x00ce, B:40:0x00d4, B:42:0x00dc, B:43:0x00e3, B:45:0x00eb, B:46:0x00f2, B:48:0x00fa, B:49:0x0100, B:51:0x0108, B:52:0x010e, B:54:0x0116, B:55:0x011c, B:57:0x0124, B:58:0x012b, B:60:0x0134, B:61:0x0139, B:63:0x0141, B:64:0x0147, B:66:0x014f, B:169:0x037d, B:171:0x0385, B:172:0x038a, B:174:0x0392, B:175:0x0397, B:177:0x039f, B:178:0x03a4, B:180:0x03ac, B:181:0x03b1, B:183:0x03b9, B:184:0x03be, B:186:0x03c6, B:187:0x03cb, B:189:0x03d3, B:190:0x03d8, B:192:0x03e0, B:193:0x03e5, B:195:0x03ed, B:196:0x03f2, B:198:0x03fa, B:199:0x03ff, B:201:0x0407, B:202:0x040c, B:204:0x0414, B:205:0x0419, B:207:0x0421, B:208:0x0428, B:210:0x0430, B:211:0x0435, B:213:0x043d, B:214:0x0442, B:216:0x044a, B:217:0x044f, B:219:0x0457, B:220:0x045c, B:222:0x0464, B:223:0x0469, B:225:0x0471, B:226:0x0476, B:228:0x047e, B:229:0x0483, B:231:0x048b, B:232:0x0490, B:234:0x0498, B:235:0x049d, B:237:0x04a5, B:238:0x04aa, B:240:0x04b2, B:241:0x04b7, B:243:0x04bf, B:244:0x04c4, B:246:0x04cc, B:247:0x04d1, B:249:0x04d9, B:250:0x04de, B:252:0x04e6, B:253:0x04eb, B:255:0x04f3, B:256:0x04f8, B:258:0x0500, B:259:0x0505, B:261:0x050d, B:262:0x0512, B:264:0x051a, B:265:0x051f, B:267:0x0527, B:268:0x052c, B:270:0x0534, B:271:0x0539, B:273:0x0541, B:274:0x0546, B:276:0x054e, B:277:0x0553, B:279:0x055b, B:280:0x0560, B:282:0x0568, B:283:0x056d, B:285:0x0575, B:286:0x057a, B:288:0x0582, B:289:0x0587, B:291:0x058f, B:292:0x0594, B:294:0x059c, B:295:0x05a1, B:297:0x05a9, B:298:0x05ae, B:300:0x05b6, B:301:0x05bb, B:303:0x05c1, B:304:0x05c4, B:306:0x05cc, B:307:0x05d1, B:309:0x05d9, B:310:0x05de, B:312:0x05e4, B:313:0x05e7, B:315:0x05ed, B:316:0x05f0, B:318:0x05f8, B:319:0x05fd, B:321:0x0603, B:322:0x0606, B:324:0x060e, B:325:0x0613, B:327:0x061b, B:328:0x0620, B:330:0x0628, B:331:0x062d, B:333:0x0633, B:334:0x0636, B:336:0x063c, B:337:0x063f, B:339:0x0647, B:340:0x064a, B:342:0x0652, B:343:0x0655, B:345:0x065d, B:346:0x0660, B:348:0x0668, B:349:0x066b, B:351:0x0675, B:352:0x067a, B:354:0x0682, B:355:0x0687, B:357:0x068f, B:358:0x0694, B:360:0x069c, B:361:0x06a1, B:363:0x06a9, B:364:0x06ae, B:366:0x06b6, B:367:0x06bb, B:369:0x06c3, B:370:0x06c8, B:372:0x06d0, B:373:0x06d5, B:375:0x06dd, B:376:0x06e2, B:378:0x06ea, B:379:0x06ef, B:381:0x06f7, B:382:0x06fc, B:384:0x0704, B:385:0x0709, B:387:0x0711, B:388:0x0716, B:390:0x071e, B:391:0x0723, B:393:0x072b, B:394:0x0730, B:396:0x0738, B:397:0x073d, B:399:0x0745, B:400:0x074a, B:402:0x0752, B:403:0x0757, B:405:0x075f, B:406:0x0764, B:408:0x076c, B:409:0x0771, B:411:0x0779, B:412:0x077e, B:415:0x078b, B:422:0x079e, B:425:0x07ac, B:428:0x07ba, B:431:0x07c4, B:433:0x07d0, B:434:0x07d2, B:437:0x07e0, B:440:0x07ee, B:442:0x07f6, B:444:0x0802, B:446:0x0808, B:447:0x0814, B:449:0x0817, B:454:0x0827, B:456:0x082f, B:458:0x0837, B:460:0x0843, B:462:0x0849, B:463:0x0853, B:465:0x0856, B:470:0x0866, B:472:0x086c, B:474:0x0874, B:476:0x0880, B:478:0x0886, B:479:0x0890, B:481:0x0893, B:486:0x08a3, B:488:0x08a9, B:490:0x08b1, B:492:0x08bd, B:494:0x08c3, B:495:0x08cd, B:497:0x08d0, B:502:0x08e0, B:504:0x08e6, B:506:0x08ee, B:508:0x08fa, B:510:0x0900, B:511:0x090a, B:513:0x090d, B:518:0x091d, B:520:0x0923, B:522:0x092b, B:524:0x0937, B:526:0x093d, B:527:0x0947, B:529:0x094a, B:534:0x095a, B:536:0x0960, B:538:0x0968, B:540:0x0970, B:542:0x0976, B:544:0x0984, B:548:0x09a7, B:550:0x09af, B:552:0x09bb, B:553:0x09be, B:555:0x09c4, B:556:0x09c7, B:558:0x09cd, B:559:0x09d0, B:561:0x09d6, B:562:0x09d9, B:564:0x09df, B:565:0x09e2, B:567:0x09e8, B:568:0x09eb, B:570:0x09f1, B:571:0x09f4, B:573:0x09fc, B:574:0x09ff, B:576:0x0a07, B:577:0x0a0a, B:579:0x0a12, B:580:0x0a15, B:582:0x0a1d, B:584:0x0a2b, B:585:0x0a30, B:587:0x0a38, B:588:0x0a3d, B:590:0x0a45, B:591:0x0a4a, B:593:0x0a52, B:594:0x0a57, B:596:0x0a5f, B:597:0x0a64, B:599:0x0a6c, B:600:0x0a71, B:602:0x0a79, B:603:0x0a7e, B:605:0x0a86, B:606:0x0a8b, B:608:0x0a93, B:609:0x0a98, B:623:0x0afe, B:645:0x0b8a, B:647:0x0b92, B:648:0x0b97, B:650:0x0b9f, B:651:0x0ba4, B:653:0x0bac, B:654:0x0bb1, B:656:0x0bb9, B:657:0x0bbe, B:659:0x0bc6, B:660:0x0bcb, B:662:0x0bd3, B:663:0x0bd8, B:665:0x0be0, B:666:0x0be5, B:668:0x0bed, B:669:0x0bf2, B:671:0x0bfa, B:672:0x0bff, B:674:0x0c07, B:675:0x0c0c, B:677:0x0c14, B:678:0x0c19, B:680:0x0c21, B:681:0x0c26, B:683:0x0c2e, B:684:0x0c33, B:686:0x0c3b, B:687:0x0c40, B:689:0x0c48, B:690:0x0c4d, B:692:0x0c55, B:693:0x0c5a, B:695:0x0c62, B:696:0x0c67, B:698:0x0c6f, B:699:0x0c74, B:701:0x0c7c, B:702:0x0c81, B:704:0x0c89, B:705:0x0c8e, B:707:0x0c96, B:708:0x0c9b, B:710:0x0ca3, B:711:0x0ca9, B:713:0x0cb1, B:714:0x0cb8, B:716:0x0cc0, B:717:0x0cc9, B:719:0x0cd1, B:720:0x0cd8, B:722:0x0ce0, B:723:0x0ce7, B:725:0x0cef, B:726:0x0cf4, B:728:0x0cfc, B:729:0x0d01, B:731:0x0d09, B:732:0x0d0e, B:734:0x0d16, B:735:0x0d1b, B:737:0x0d23, B:738:0x0d29, B:740:0x0d31, B:741:0x0d38, B:743:0x0d40, B:744:0x0d46, B:746:0x0d4e, B:747:0x0d54, B:749:0x0d5c, B:750:0x0d62, B:752:0x0d6a, B:758:0x0d98, B:760:0x0da0, B:761:0x0da5, B:763:0x0dad, B:764:0x0db2, B:766:0x0dba, B:767:0x0dc0, B:769:0x0dc8, B:770:0x0dcf, B:772:0x0dd7, B:773:0x0ddd, B:775:0x0de5, B:776:0x0dea, B:778:0x0df2, B:779:0x0df8, B:781:0x0e00, B:782:0x0e05, B:784:0x0e0d, B:785:0x0e14, B:787:0x0e1c, B:788:0x0e22, B:790:0x0e2a, B:791:0x0e30, B:793:0x0e38, B:794:0x0e42, B:796:0x0e4a, B:797:0x0e54, B:799:0x0e5c, B:800:0x0e62, B:802:0x0e6a, B:803:0x0e6f, B:805:0x0e77, B:806:0x0e7c, B:808:0x0e84, B:809:0x0e89, B:811:0x0e91, B:812:0x0e96, B:814:0x0e9e, B:815:0x0ea4, B:817:0x0eac, B:818:0x0eb5, B:820:0x0ebd, B:821:0x0ec7, B:823:0x0ecf, B:824:0x0ed9, B:826:0x0ee1, B:827:0x0ee7, B:829:0x0eef, B:830:0x0ef5, B:832:0x0efd, B:833:0x0f05, B:835:0x0f0d, B:836:0x0f15, B:838:0x0f1d, B:839:0x0f25, B:841:0x0f2d, B:842:0x0f32, B:844:0x0f3a, B:845:0x0f3f, B:847:0x0f47, B:849:0x0f53, B:851:0x0f5b, B:852:0x0f67, B:854:0x0f6f, B:855:0x0f74, B:857:0x0f7c, B:858:0x0f81, B:860:0x0f89, B:861:0x0f8e, B:863:0x0f96, B:864:0x0f9b, B:866:0x0fa3, B:867:0x0fa8, B:869:0x0fb0, B:644:0x0b87, B:622:0x0afb, B:533:0x0957, B:535:0x095d, B:517:0x091a, B:519:0x0920, B:501:0x08dd, B:503:0x08e3, B:485:0x08a0, B:487:0x08a6, B:469:0x0863, B:471:0x0869, B:453:0x0824, B:455:0x082a, B:168:0x037a, B:125:0x02a3, B:127:0x02ab, B:129:0x02b9, B:130:0x02be, B:132:0x02c6, B:133:0x02cb, B:135:0x02d3, B:136:0x02e3, B:138:0x02eb, B:139:0x02f0, B:141:0x02f8, B:142:0x02fd, B:144:0x0305, B:145:0x0315, B:147:0x031d, B:148:0x0322, B:150:0x032a, B:151:0x032f, B:153:0x0337, B:154:0x033f, B:156:0x0347, B:157:0x034f, B:159:0x0357, B:160:0x035e, B:162:0x0364, B:164:0x0370, B:611:0x0aa0, B:613:0x0aad, B:615:0x0ab9, B:617:0x0aea, B:618:0x0af1, B:625:0x0b06, B:627:0x0b13, B:629:0x0b19, B:631:0x0b21, B:633:0x0b29, B:635:0x0b31, B:637:0x0b39, B:639:0x0b76, B:640:0x0b7d), top: B:907:0x0055, inners: #2, #4, #8, #9, #12, #13, #16, #18, #19 }] */
    /* JADX WARN: Code duplicated, block: B:519:0x0920 A[Catch: Exception -> 0x0fb6, TryCatch #11 {Exception -> 0x0fb6, blocks: (B:12:0x0055, B:14:0x0060, B:15:0x0063, B:19:0x006e, B:21:0x0079, B:23:0x0085, B:25:0x008b, B:27:0x0093, B:28:0x009f, B:30:0x00a5, B:31:0x00aa, B:33:0x00b2, B:34:0x00b8, B:36:0x00c0, B:37:0x00c6, B:39:0x00ce, B:40:0x00d4, B:42:0x00dc, B:43:0x00e3, B:45:0x00eb, B:46:0x00f2, B:48:0x00fa, B:49:0x0100, B:51:0x0108, B:52:0x010e, B:54:0x0116, B:55:0x011c, B:57:0x0124, B:58:0x012b, B:60:0x0134, B:61:0x0139, B:63:0x0141, B:64:0x0147, B:66:0x014f, B:169:0x037d, B:171:0x0385, B:172:0x038a, B:174:0x0392, B:175:0x0397, B:177:0x039f, B:178:0x03a4, B:180:0x03ac, B:181:0x03b1, B:183:0x03b9, B:184:0x03be, B:186:0x03c6, B:187:0x03cb, B:189:0x03d3, B:190:0x03d8, B:192:0x03e0, B:193:0x03e5, B:195:0x03ed, B:196:0x03f2, B:198:0x03fa, B:199:0x03ff, B:201:0x0407, B:202:0x040c, B:204:0x0414, B:205:0x0419, B:207:0x0421, B:208:0x0428, B:210:0x0430, B:211:0x0435, B:213:0x043d, B:214:0x0442, B:216:0x044a, B:217:0x044f, B:219:0x0457, B:220:0x045c, B:222:0x0464, B:223:0x0469, B:225:0x0471, B:226:0x0476, B:228:0x047e, B:229:0x0483, B:231:0x048b, B:232:0x0490, B:234:0x0498, B:235:0x049d, B:237:0x04a5, B:238:0x04aa, B:240:0x04b2, B:241:0x04b7, B:243:0x04bf, B:244:0x04c4, B:246:0x04cc, B:247:0x04d1, B:249:0x04d9, B:250:0x04de, B:252:0x04e6, B:253:0x04eb, B:255:0x04f3, B:256:0x04f8, B:258:0x0500, B:259:0x0505, B:261:0x050d, B:262:0x0512, B:264:0x051a, B:265:0x051f, B:267:0x0527, B:268:0x052c, B:270:0x0534, B:271:0x0539, B:273:0x0541, B:274:0x0546, B:276:0x054e, B:277:0x0553, B:279:0x055b, B:280:0x0560, B:282:0x0568, B:283:0x056d, B:285:0x0575, B:286:0x057a, B:288:0x0582, B:289:0x0587, B:291:0x058f, B:292:0x0594, B:294:0x059c, B:295:0x05a1, B:297:0x05a9, B:298:0x05ae, B:300:0x05b6, B:301:0x05bb, B:303:0x05c1, B:304:0x05c4, B:306:0x05cc, B:307:0x05d1, B:309:0x05d9, B:310:0x05de, B:312:0x05e4, B:313:0x05e7, B:315:0x05ed, B:316:0x05f0, B:318:0x05f8, B:319:0x05fd, B:321:0x0603, B:322:0x0606, B:324:0x060e, B:325:0x0613, B:327:0x061b, B:328:0x0620, B:330:0x0628, B:331:0x062d, B:333:0x0633, B:334:0x0636, B:336:0x063c, B:337:0x063f, B:339:0x0647, B:340:0x064a, B:342:0x0652, B:343:0x0655, B:345:0x065d, B:346:0x0660, B:348:0x0668, B:349:0x066b, B:351:0x0675, B:352:0x067a, B:354:0x0682, B:355:0x0687, B:357:0x068f, B:358:0x0694, B:360:0x069c, B:361:0x06a1, B:363:0x06a9, B:364:0x06ae, B:366:0x06b6, B:367:0x06bb, B:369:0x06c3, B:370:0x06c8, B:372:0x06d0, B:373:0x06d5, B:375:0x06dd, B:376:0x06e2, B:378:0x06ea, B:379:0x06ef, B:381:0x06f7, B:382:0x06fc, B:384:0x0704, B:385:0x0709, B:387:0x0711, B:388:0x0716, B:390:0x071e, B:391:0x0723, B:393:0x072b, B:394:0x0730, B:396:0x0738, B:397:0x073d, B:399:0x0745, B:400:0x074a, B:402:0x0752, B:403:0x0757, B:405:0x075f, B:406:0x0764, B:408:0x076c, B:409:0x0771, B:411:0x0779, B:412:0x077e, B:415:0x078b, B:422:0x079e, B:425:0x07ac, B:428:0x07ba, B:431:0x07c4, B:433:0x07d0, B:434:0x07d2, B:437:0x07e0, B:440:0x07ee, B:442:0x07f6, B:444:0x0802, B:446:0x0808, B:447:0x0814, B:449:0x0817, B:454:0x0827, B:456:0x082f, B:458:0x0837, B:460:0x0843, B:462:0x0849, B:463:0x0853, B:465:0x0856, B:470:0x0866, B:472:0x086c, B:474:0x0874, B:476:0x0880, B:478:0x0886, B:479:0x0890, B:481:0x0893, B:486:0x08a3, B:488:0x08a9, B:490:0x08b1, B:492:0x08bd, B:494:0x08c3, B:495:0x08cd, B:497:0x08d0, B:502:0x08e0, B:504:0x08e6, B:506:0x08ee, B:508:0x08fa, B:510:0x0900, B:511:0x090a, B:513:0x090d, B:518:0x091d, B:520:0x0923, B:522:0x092b, B:524:0x0937, B:526:0x093d, B:527:0x0947, B:529:0x094a, B:534:0x095a, B:536:0x0960, B:538:0x0968, B:540:0x0970, B:542:0x0976, B:544:0x0984, B:548:0x09a7, B:550:0x09af, B:552:0x09bb, B:553:0x09be, B:555:0x09c4, B:556:0x09c7, B:558:0x09cd, B:559:0x09d0, B:561:0x09d6, B:562:0x09d9, B:564:0x09df, B:565:0x09e2, B:567:0x09e8, B:568:0x09eb, B:570:0x09f1, B:571:0x09f4, B:573:0x09fc, B:574:0x09ff, B:576:0x0a07, B:577:0x0a0a, B:579:0x0a12, B:580:0x0a15, B:582:0x0a1d, B:584:0x0a2b, B:585:0x0a30, B:587:0x0a38, B:588:0x0a3d, B:590:0x0a45, B:591:0x0a4a, B:593:0x0a52, B:594:0x0a57, B:596:0x0a5f, B:597:0x0a64, B:599:0x0a6c, B:600:0x0a71, B:602:0x0a79, B:603:0x0a7e, B:605:0x0a86, B:606:0x0a8b, B:608:0x0a93, B:609:0x0a98, B:623:0x0afe, B:645:0x0b8a, B:647:0x0b92, B:648:0x0b97, B:650:0x0b9f, B:651:0x0ba4, B:653:0x0bac, B:654:0x0bb1, B:656:0x0bb9, B:657:0x0bbe, B:659:0x0bc6, B:660:0x0bcb, B:662:0x0bd3, B:663:0x0bd8, B:665:0x0be0, B:666:0x0be5, B:668:0x0bed, B:669:0x0bf2, B:671:0x0bfa, B:672:0x0bff, B:674:0x0c07, B:675:0x0c0c, B:677:0x0c14, B:678:0x0c19, B:680:0x0c21, B:681:0x0c26, B:683:0x0c2e, B:684:0x0c33, B:686:0x0c3b, B:687:0x0c40, B:689:0x0c48, B:690:0x0c4d, B:692:0x0c55, B:693:0x0c5a, B:695:0x0c62, B:696:0x0c67, B:698:0x0c6f, B:699:0x0c74, B:701:0x0c7c, B:702:0x0c81, B:704:0x0c89, B:705:0x0c8e, B:707:0x0c96, B:708:0x0c9b, B:710:0x0ca3, B:711:0x0ca9, B:713:0x0cb1, B:714:0x0cb8, B:716:0x0cc0, B:717:0x0cc9, B:719:0x0cd1, B:720:0x0cd8, B:722:0x0ce0, B:723:0x0ce7, B:725:0x0cef, B:726:0x0cf4, B:728:0x0cfc, B:729:0x0d01, B:731:0x0d09, B:732:0x0d0e, B:734:0x0d16, B:735:0x0d1b, B:737:0x0d23, B:738:0x0d29, B:740:0x0d31, B:741:0x0d38, B:743:0x0d40, B:744:0x0d46, B:746:0x0d4e, B:747:0x0d54, B:749:0x0d5c, B:750:0x0d62, B:752:0x0d6a, B:758:0x0d98, B:760:0x0da0, B:761:0x0da5, B:763:0x0dad, B:764:0x0db2, B:766:0x0dba, B:767:0x0dc0, B:769:0x0dc8, B:770:0x0dcf, B:772:0x0dd7, B:773:0x0ddd, B:775:0x0de5, B:776:0x0dea, B:778:0x0df2, B:779:0x0df8, B:781:0x0e00, B:782:0x0e05, B:784:0x0e0d, B:785:0x0e14, B:787:0x0e1c, B:788:0x0e22, B:790:0x0e2a, B:791:0x0e30, B:793:0x0e38, B:794:0x0e42, B:796:0x0e4a, B:797:0x0e54, B:799:0x0e5c, B:800:0x0e62, B:802:0x0e6a, B:803:0x0e6f, B:805:0x0e77, B:806:0x0e7c, B:808:0x0e84, B:809:0x0e89, B:811:0x0e91, B:812:0x0e96, B:814:0x0e9e, B:815:0x0ea4, B:817:0x0eac, B:818:0x0eb5, B:820:0x0ebd, B:821:0x0ec7, B:823:0x0ecf, B:824:0x0ed9, B:826:0x0ee1, B:827:0x0ee7, B:829:0x0eef, B:830:0x0ef5, B:832:0x0efd, B:833:0x0f05, B:835:0x0f0d, B:836:0x0f15, B:838:0x0f1d, B:839:0x0f25, B:841:0x0f2d, B:842:0x0f32, B:844:0x0f3a, B:845:0x0f3f, B:847:0x0f47, B:849:0x0f53, B:851:0x0f5b, B:852:0x0f67, B:854:0x0f6f, B:855:0x0f74, B:857:0x0f7c, B:858:0x0f81, B:860:0x0f89, B:861:0x0f8e, B:863:0x0f96, B:864:0x0f9b, B:866:0x0fa3, B:867:0x0fa8, B:869:0x0fb0, B:644:0x0b87, B:622:0x0afb, B:533:0x0957, B:535:0x095d, B:517:0x091a, B:519:0x0920, B:501:0x08dd, B:503:0x08e3, B:485:0x08a0, B:487:0x08a6, B:469:0x0863, B:471:0x0869, B:453:0x0824, B:455:0x082a, B:168:0x037a, B:125:0x02a3, B:127:0x02ab, B:129:0x02b9, B:130:0x02be, B:132:0x02c6, B:133:0x02cb, B:135:0x02d3, B:136:0x02e3, B:138:0x02eb, B:139:0x02f0, B:141:0x02f8, B:142:0x02fd, B:144:0x0305, B:145:0x0315, B:147:0x031d, B:148:0x0322, B:150:0x032a, B:151:0x032f, B:153:0x0337, B:154:0x033f, B:156:0x0347, B:157:0x034f, B:159:0x0357, B:160:0x035e, B:162:0x0364, B:164:0x0370, B:611:0x0aa0, B:613:0x0aad, B:615:0x0ab9, B:617:0x0aea, B:618:0x0af1, B:625:0x0b06, B:627:0x0b13, B:629:0x0b19, B:631:0x0b21, B:633:0x0b29, B:635:0x0b31, B:637:0x0b39, B:639:0x0b76, B:640:0x0b7d), top: B:907:0x0055, inners: #2, #4, #8, #9, #12, #13, #16, #18, #19 }] */
    /* JADX WARN: Code duplicated, block: B:535:0x095d A[Catch: Exception -> 0x0fb6, TryCatch #11 {Exception -> 0x0fb6, blocks: (B:12:0x0055, B:14:0x0060, B:15:0x0063, B:19:0x006e, B:21:0x0079, B:23:0x0085, B:25:0x008b, B:27:0x0093, B:28:0x009f, B:30:0x00a5, B:31:0x00aa, B:33:0x00b2, B:34:0x00b8, B:36:0x00c0, B:37:0x00c6, B:39:0x00ce, B:40:0x00d4, B:42:0x00dc, B:43:0x00e3, B:45:0x00eb, B:46:0x00f2, B:48:0x00fa, B:49:0x0100, B:51:0x0108, B:52:0x010e, B:54:0x0116, B:55:0x011c, B:57:0x0124, B:58:0x012b, B:60:0x0134, B:61:0x0139, B:63:0x0141, B:64:0x0147, B:66:0x014f, B:169:0x037d, B:171:0x0385, B:172:0x038a, B:174:0x0392, B:175:0x0397, B:177:0x039f, B:178:0x03a4, B:180:0x03ac, B:181:0x03b1, B:183:0x03b9, B:184:0x03be, B:186:0x03c6, B:187:0x03cb, B:189:0x03d3, B:190:0x03d8, B:192:0x03e0, B:193:0x03e5, B:195:0x03ed, B:196:0x03f2, B:198:0x03fa, B:199:0x03ff, B:201:0x0407, B:202:0x040c, B:204:0x0414, B:205:0x0419, B:207:0x0421, B:208:0x0428, B:210:0x0430, B:211:0x0435, B:213:0x043d, B:214:0x0442, B:216:0x044a, B:217:0x044f, B:219:0x0457, B:220:0x045c, B:222:0x0464, B:223:0x0469, B:225:0x0471, B:226:0x0476, B:228:0x047e, B:229:0x0483, B:231:0x048b, B:232:0x0490, B:234:0x0498, B:235:0x049d, B:237:0x04a5, B:238:0x04aa, B:240:0x04b2, B:241:0x04b7, B:243:0x04bf, B:244:0x04c4, B:246:0x04cc, B:247:0x04d1, B:249:0x04d9, B:250:0x04de, B:252:0x04e6, B:253:0x04eb, B:255:0x04f3, B:256:0x04f8, B:258:0x0500, B:259:0x0505, B:261:0x050d, B:262:0x0512, B:264:0x051a, B:265:0x051f, B:267:0x0527, B:268:0x052c, B:270:0x0534, B:271:0x0539, B:273:0x0541, B:274:0x0546, B:276:0x054e, B:277:0x0553, B:279:0x055b, B:280:0x0560, B:282:0x0568, B:283:0x056d, B:285:0x0575, B:286:0x057a, B:288:0x0582, B:289:0x0587, B:291:0x058f, B:292:0x0594, B:294:0x059c, B:295:0x05a1, B:297:0x05a9, B:298:0x05ae, B:300:0x05b6, B:301:0x05bb, B:303:0x05c1, B:304:0x05c4, B:306:0x05cc, B:307:0x05d1, B:309:0x05d9, B:310:0x05de, B:312:0x05e4, B:313:0x05e7, B:315:0x05ed, B:316:0x05f0, B:318:0x05f8, B:319:0x05fd, B:321:0x0603, B:322:0x0606, B:324:0x060e, B:325:0x0613, B:327:0x061b, B:328:0x0620, B:330:0x0628, B:331:0x062d, B:333:0x0633, B:334:0x0636, B:336:0x063c, B:337:0x063f, B:339:0x0647, B:340:0x064a, B:342:0x0652, B:343:0x0655, B:345:0x065d, B:346:0x0660, B:348:0x0668, B:349:0x066b, B:351:0x0675, B:352:0x067a, B:354:0x0682, B:355:0x0687, B:357:0x068f, B:358:0x0694, B:360:0x069c, B:361:0x06a1, B:363:0x06a9, B:364:0x06ae, B:366:0x06b6, B:367:0x06bb, B:369:0x06c3, B:370:0x06c8, B:372:0x06d0, B:373:0x06d5, B:375:0x06dd, B:376:0x06e2, B:378:0x06ea, B:379:0x06ef, B:381:0x06f7, B:382:0x06fc, B:384:0x0704, B:385:0x0709, B:387:0x0711, B:388:0x0716, B:390:0x071e, B:391:0x0723, B:393:0x072b, B:394:0x0730, B:396:0x0738, B:397:0x073d, B:399:0x0745, B:400:0x074a, B:402:0x0752, B:403:0x0757, B:405:0x075f, B:406:0x0764, B:408:0x076c, B:409:0x0771, B:411:0x0779, B:412:0x077e, B:415:0x078b, B:422:0x079e, B:425:0x07ac, B:428:0x07ba, B:431:0x07c4, B:433:0x07d0, B:434:0x07d2, B:437:0x07e0, B:440:0x07ee, B:442:0x07f6, B:444:0x0802, B:446:0x0808, B:447:0x0814, B:449:0x0817, B:454:0x0827, B:456:0x082f, B:458:0x0837, B:460:0x0843, B:462:0x0849, B:463:0x0853, B:465:0x0856, B:470:0x0866, B:472:0x086c, B:474:0x0874, B:476:0x0880, B:478:0x0886, B:479:0x0890, B:481:0x0893, B:486:0x08a3, B:488:0x08a9, B:490:0x08b1, B:492:0x08bd, B:494:0x08c3, B:495:0x08cd, B:497:0x08d0, B:502:0x08e0, B:504:0x08e6, B:506:0x08ee, B:508:0x08fa, B:510:0x0900, B:511:0x090a, B:513:0x090d, B:518:0x091d, B:520:0x0923, B:522:0x092b, B:524:0x0937, B:526:0x093d, B:527:0x0947, B:529:0x094a, B:534:0x095a, B:536:0x0960, B:538:0x0968, B:540:0x0970, B:542:0x0976, B:544:0x0984, B:548:0x09a7, B:550:0x09af, B:552:0x09bb, B:553:0x09be, B:555:0x09c4, B:556:0x09c7, B:558:0x09cd, B:559:0x09d0, B:561:0x09d6, B:562:0x09d9, B:564:0x09df, B:565:0x09e2, B:567:0x09e8, B:568:0x09eb, B:570:0x09f1, B:571:0x09f4, B:573:0x09fc, B:574:0x09ff, B:576:0x0a07, B:577:0x0a0a, B:579:0x0a12, B:580:0x0a15, B:582:0x0a1d, B:584:0x0a2b, B:585:0x0a30, B:587:0x0a38, B:588:0x0a3d, B:590:0x0a45, B:591:0x0a4a, B:593:0x0a52, B:594:0x0a57, B:596:0x0a5f, B:597:0x0a64, B:599:0x0a6c, B:600:0x0a71, B:602:0x0a79, B:603:0x0a7e, B:605:0x0a86, B:606:0x0a8b, B:608:0x0a93, B:609:0x0a98, B:623:0x0afe, B:645:0x0b8a, B:647:0x0b92, B:648:0x0b97, B:650:0x0b9f, B:651:0x0ba4, B:653:0x0bac, B:654:0x0bb1, B:656:0x0bb9, B:657:0x0bbe, B:659:0x0bc6, B:660:0x0bcb, B:662:0x0bd3, B:663:0x0bd8, B:665:0x0be0, B:666:0x0be5, B:668:0x0bed, B:669:0x0bf2, B:671:0x0bfa, B:672:0x0bff, B:674:0x0c07, B:675:0x0c0c, B:677:0x0c14, B:678:0x0c19, B:680:0x0c21, B:681:0x0c26, B:683:0x0c2e, B:684:0x0c33, B:686:0x0c3b, B:687:0x0c40, B:689:0x0c48, B:690:0x0c4d, B:692:0x0c55, B:693:0x0c5a, B:695:0x0c62, B:696:0x0c67, B:698:0x0c6f, B:699:0x0c74, B:701:0x0c7c, B:702:0x0c81, B:704:0x0c89, B:705:0x0c8e, B:707:0x0c96, B:708:0x0c9b, B:710:0x0ca3, B:711:0x0ca9, B:713:0x0cb1, B:714:0x0cb8, B:716:0x0cc0, B:717:0x0cc9, B:719:0x0cd1, B:720:0x0cd8, B:722:0x0ce0, B:723:0x0ce7, B:725:0x0cef, B:726:0x0cf4, B:728:0x0cfc, B:729:0x0d01, B:731:0x0d09, B:732:0x0d0e, B:734:0x0d16, B:735:0x0d1b, B:737:0x0d23, B:738:0x0d29, B:740:0x0d31, B:741:0x0d38, B:743:0x0d40, B:744:0x0d46, B:746:0x0d4e, B:747:0x0d54, B:749:0x0d5c, B:750:0x0d62, B:752:0x0d6a, B:758:0x0d98, B:760:0x0da0, B:761:0x0da5, B:763:0x0dad, B:764:0x0db2, B:766:0x0dba, B:767:0x0dc0, B:769:0x0dc8, B:770:0x0dcf, B:772:0x0dd7, B:773:0x0ddd, B:775:0x0de5, B:776:0x0dea, B:778:0x0df2, B:779:0x0df8, B:781:0x0e00, B:782:0x0e05, B:784:0x0e0d, B:785:0x0e14, B:787:0x0e1c, B:788:0x0e22, B:790:0x0e2a, B:791:0x0e30, B:793:0x0e38, B:794:0x0e42, B:796:0x0e4a, B:797:0x0e54, B:799:0x0e5c, B:800:0x0e62, B:802:0x0e6a, B:803:0x0e6f, B:805:0x0e77, B:806:0x0e7c, B:808:0x0e84, B:809:0x0e89, B:811:0x0e91, B:812:0x0e96, B:814:0x0e9e, B:815:0x0ea4, B:817:0x0eac, B:818:0x0eb5, B:820:0x0ebd, B:821:0x0ec7, B:823:0x0ecf, B:824:0x0ed9, B:826:0x0ee1, B:827:0x0ee7, B:829:0x0eef, B:830:0x0ef5, B:832:0x0efd, B:833:0x0f05, B:835:0x0f0d, B:836:0x0f15, B:838:0x0f1d, B:839:0x0f25, B:841:0x0f2d, B:842:0x0f32, B:844:0x0f3a, B:845:0x0f3f, B:847:0x0f47, B:849:0x0f53, B:851:0x0f5b, B:852:0x0f67, B:854:0x0f6f, B:855:0x0f74, B:857:0x0f7c, B:858:0x0f81, B:860:0x0f89, B:861:0x0f8e, B:863:0x0f96, B:864:0x0f9b, B:866:0x0fa3, B:867:0x0fa8, B:869:0x0fb0, B:644:0x0b87, B:622:0x0afb, B:533:0x0957, B:535:0x095d, B:517:0x091a, B:519:0x0920, B:501:0x08dd, B:503:0x08e3, B:485:0x08a0, B:487:0x08a6, B:469:0x0863, B:471:0x0869, B:453:0x0824, B:455:0x082a, B:168:0x037a, B:125:0x02a3, B:127:0x02ab, B:129:0x02b9, B:130:0x02be, B:132:0x02c6, B:133:0x02cb, B:135:0x02d3, B:136:0x02e3, B:138:0x02eb, B:139:0x02f0, B:141:0x02f8, B:142:0x02fd, B:144:0x0305, B:145:0x0315, B:147:0x031d, B:148:0x0322, B:150:0x032a, B:151:0x032f, B:153:0x0337, B:154:0x033f, B:156:0x0347, B:157:0x034f, B:159:0x0357, B:160:0x035e, B:162:0x0364, B:164:0x0370, B:611:0x0aa0, B:613:0x0aad, B:615:0x0ab9, B:617:0x0aea, B:618:0x0af1, B:625:0x0b06, B:627:0x0b13, B:629:0x0b19, B:631:0x0b21, B:633:0x0b29, B:635:0x0b31, B:637:0x0b39, B:639:0x0b76, B:640:0x0b7d), top: B:907:0x0055, inners: #2, #4, #8, #9, #12, #13, #16, #18, #19 }] */
    public void b(boolean z) {
        String str;
        String string;
        String string2;
        String strA = r.a().a("vdrconfig_gz", "");
        if (!TextUtils.isEmpty(strA)) {
            try {
                byte[] bArrB = a.a.a.i.i.b(Base64.decode(strA, 0));
                if (bArrB != null) {
                    strA = new String(bArrB, "UTF-8");
                }
            } catch (Exception unused) {
                strA = null;
            }
        }
        if (strA == null || strA.length() <= 1) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strA);
            if (jSONObject.has("ison")) {
                jSONObject.getInt("ison");
            }
            if (jSONObject.has("hysV2")) {
                jSONObject.optInt("hysV2", 1);
                if (jSONObject.has("hdyfms")) {
                    String strOptString = jSONObject.optString("hdyfms");
                    if (!"".equals(strOptString) && strOptString.contains("|")) {
                        String[] strArrSplit = strOptString.split("\\|");
                        if (strArrSplit.length >= 2) {
                            Integer.parseInt(strArrSplit[0]);
                            Integer.parseInt(strArrSplit[1]);
                        }
                    }
                }
            }
            if (jSONObject.has("hdynwot")) {
                jSONObject.optInt("hdynwot", 2000);
            }
            if (jSONObject.has("hyp")) {
                jSONObject.optString("hyp", null);
            }
            if (jSONObject.has("navilane")) {
                jSONObject.optInt("navilane", 0);
            }
            if (jSONObject.has("navilane_dr")) {
                jSONObject.optInt("navilane_dr", 0);
            }
            if (jSONObject.has("navilane_uat")) {
                jSONObject.optInt("navilane_uat", 15);
            }
            if (jSONObject.has("navilane_dr_para")) {
                jSONObject.optInt("navilane_dr_para", 500);
            }
            if (jSONObject.has("bmsrco")) {
                jSONObject.optInt("bmsrco", 1);
            }
            if (jSONObject.has("bhyco")) {
                jSONObject.optInt("bhyco", 1);
            }
            if (jSONObject.has("rcapso")) {
                jSONObject.optInt("rcapso", 1);
            }
            if (jSONObject.has("rcpgn")) {
                jSONObject.optInt("rcpgn", 15);
            }
            if (jSONObject.has("rcjlgt")) {
                jSONObject.optInt("rcjlgt", 3);
            }
            if (jSONObject.has("splprs")) {
                jSONObject.optInt("splprs", -1);
            }
            if (jSONObject.has("cbds")) {
                jSONObject.optInt("cbds");
            }
            try {
                if (jSONObject.has("hploc")) {
                    String string3 = jSONObject.getString("hploc");
                    if (!TextUtils.isEmpty(string3) && string3.contains("|")) {
                        String[] strArrSplit2 = string3.split("\\|");
                        if (strArrSplit2 != null && strArrSplit2.length >= 2) {
                            if (strArrSplit2[0].equals("RMS")) {
                                this.z = true;
                            } else if (strArrSplit2[0].equals("BMS")) {
                                this.A = true;
                            } else if (strArrSplit2[0].equals("HMS")) {
                                this.x = true;
                            } else if (strArrSplit2[0].equals("HPMS")) {
                                this.B = true;
                            } else if (strArrSplit2[0].equals("HMS,BMS")) {
                                this.y = true;
                            }
                            if (this.z || this.A || this.x || this.B || this.y) {
                                if (strArrSplit2[1].equals("ALL")) {
                                    this.E = 1;
                                } else if (strArrSplit2[1].equals("NAVI")) {
                                    this.E = 2;
                                }
                            }
                            String str2 = string3 + "," + this.z + "," + this.B + "," + this.x + "," + this.A + "," + this.y + "," + this.E;
                        }
                        Log.i("baidu_location_service", "CloudConfig hplocation config = hms " + this.x + "; rms " + this.z + "; baidurtk " + this.A + " ; hdlocationuse = " + this.E);
                    }
                }
                if (jSONObject.has("hdlnp")) {
                    jSONObject.optInt("hdlnp", 1);
                }
                if (jSONObject.has("hdlnpt")) {
                    jSONObject.optInt("hdlnpt", 1500);
                }
                if (jSONObject.has("viaduct") && (string2 = jSONObject.getString("viaduct")) != null) {
                    "RY".equals(string2);
                }
            } catch (Exception unused2) {
            }
            try {
                if (jSONObject.has("cfms")) {
                    jSONObject.getJSONArray("cfms");
                }
            } catch (Exception unused3) {
            }
            try {
                if (jSONObject.has("traf_ctrl_value")) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("traf_ctrl_value");
                    if (jSONObjectOptJSONObject.has("subway_switch")) {
                        jSONObjectOptJSONObject.optInt("subway_switch");
                    }
                    if (jSONObjectOptJSONObject.has("subway_paramter")) {
                        jSONObjectOptJSONObject.optString("subway_paramter");
                    }
                    if (jSONObjectOptJSONObject.has("sub_col_prob")) {
                        this.C = jSONObjectOptJSONObject.optDouble("sub_col_prob");
                        new Random().nextDouble();
                    }
                    if (jSONObjectOptJSONObject.has("sub_col_onland")) {
                        jSONObjectOptJSONObject.optInt("sub_col_onland");
                    }
                    if (jSONObjectOptJSONObject.has("press_col_switch")) {
                        jSONObjectOptJSONObject.optInt("press_col_switch");
                    }
                    if (jSONObjectOptJSONObject.has("press_col_prob")) {
                        this.D = jSONObjectOptJSONObject.optDouble("press_col_prob");
                        new Random().nextDouble();
                    }
                    if (jSONObjectOptJSONObject.has("traffic_switch")) {
                        jSONObjectOptJSONObject.optInt("traffic_switch");
                    }
                    if (jSONObjectOptJSONObject.has("traffic_paramter")) {
                        jSONObjectOptJSONObject.optString("traffic_paramter");
                    }
                    if (jSONObjectOptJSONObject.has("gps_checker_switch_android")) {
                        this.F = jSONObjectOptJSONObject.optInt("gps_checker_switch_android");
                    }
                    if (jSONObjectOptJSONObject.has("gps_checker_params_android")) {
                        this.G = jSONObjectOptJSONObject.optString("gps_checker_params_android");
                    }
                    if (jSONObjectOptJSONObject.has("model")) {
                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("model");
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                            if (jSONObjectOptJSONObject2.has("name")) {
                                jSONObjectOptJSONObject2.optString("name");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (jSONObject.has("rpmp_indoor_model")) {
                jSONObject.optString("rpmp_indoor_model");
            }
            if (jSONObject.has("rpmp_indoor_md5")) {
                jSONObject.optString("rpmp_indoor_md5");
            }
            if (jSONObject.has("rpmp_indoor_ver")) {
                jSONObject.optString("rpmp_indoor_ver");
            }
            if (jSONObject.has("rpmp_indoor_switch")) {
                jSONObject.optInt("rpmp_indoor_switch");
            }
            if (jSONObject.has("ipbos")) {
                jSONObject.optInt("ipbos");
            }
            if (jSONObject.has("cell_scan_ver")) {
                jSONObject.optInt("cell_scan_ver");
            }
            if (jSONObject.has("tvurnd")) {
                jSONObject.optInt("tvurnd");
            }
            if (jSONObject.has("vo_t")) {
                jSONObject.getInt("vo_t");
            }
            if (jSONObject.has("vo_ep")) {
                jSONObject.getInt("vo_ep");
            }
            if (jSONObject.has("vo_sl")) {
                jSONObject.getInt("vo_sl");
            }
            if (jSONObject.has("nvso")) {
                jSONObject.getInt("nvso");
            }
            if (jSONObject.has("vo_d")) {
                jSONObject.getInt("vo_d");
            }
            if (jSONObject.has("grrct")) {
                jSONObject.optInt("grrct", 72);
            }
            if (jSONObject.has("vnrlon")) {
                jSONObject.getInt("vnrlon");
            }
            if (jSONObject.has("vlogon")) {
                jSONObject.getInt("vlogon");
            }
            if (jSONObject.has("vrtlog")) {
                jSONObject.getInt("vrtlog");
            }
            if (jSONObject.has("tbs")) {
                jSONObject.getInt("tbs");
            }
            if (jSONObject.has("rls")) {
                jSONObject.getInt("rls");
            }
            if (jSONObject.has("sdth")) {
                jSONObject.getDouble("sdth");
            }
            if (jSONObject.has("couth")) {
                jSONObject.getInt("couth");
            }
            if (jSONObject.has("accth")) {
                jSONObject.getDouble("accth");
            }
            if (jSONObject.has("lenth")) {
                jSONObject.getDouble("lenth");
            }
            if (jSONObject.has("seth")) {
                jSONObject.getDouble("seth");
            }
            if (jSONObject.has("vcso")) {
                jSONObject.getInt("vcso");
            }
            if (jSONObject.has("laeso")) {
                jSONObject.getInt("laeso");
            }
            if (jSONObject.has("vdro")) {
                jSONObject.getInt("vdro");
            }
            if (jSONObject.has("snco")) {
                jSONObject.getInt("snco");
            }
            if (jSONObject.has("vnmlo")) {
                jSONObject.getInt("vnmlo");
            }
            if (jSONObject.has("vtcrf")) {
                jSONObject.getInt("vtcrf");
            }
            if (jSONObject.has("vnsl")) {
                jSONObject.getInt("vnsl");
            }
            if (jSONObject.has("vt_max_drift")) {
                jSONObject.getInt("vt_max_drift");
            }
            if (jSONObject.has("wnsgrs")) {
                jSONObject.getInt("wnsgrs");
            }
            if (jSONObject.has("snct")) {
                jSONObject.getInt("snct");
            }
            if (jSONObject.has("vd_cross")) {
                jSONObject.getInt("vd_cross");
            }
            if (jSONObject.has("vpan")) {
                jSONObject.getInt("vpan");
            }
            if (jSONObject.has("yw")) {
                jSONObject.getDouble("yw");
            }
            if (jSONObject.has("yd1")) {
                jSONObject.getDouble("yd1");
            }
            if (jSONObject.has("yd2")) {
                jSONObject.getDouble("yd2");
            }
            if (jSONObject.has("yd3")) {
                jSONObject.getDouble("yd3");
            }
            if (jSONObject.has("yd4")) {
                jSONObject.getDouble("yd4");
            }
            if (jSONObject.has("yd5")) {
                jSONObject.getDouble("yd5");
            }
            if (jSONObject.has("yd6")) {
                jSONObject.getDouble("yd6");
            }
            if (jSONObject.has("yd7")) {
                jSONObject.getDouble("yd7");
            }
            if (jSONObject.has("yd8")) {
                jSONObject.getDouble("yd8");
            }
            if (jSONObject.has("vt")) {
                jSONObject.getInt("vt");
            }
            if (jSONObject.has("vwnp")) {
                jSONObject.getDouble("vwnp");
            }
            if (jSONObject.has("vtpct")) {
                jSONObject.getDouble("vtpct");
            }
            if (jSONObject.has("vr")) {
                jSONObject.getInt("vr");
            }
            if (jSONObject.has("vl")) {
                jSONObject.getInt("vl");
            }
            if (jSONObject.has("vg")) {
                jSONObject.getInt("vg");
            }
            if (jSONObject.has("vds")) {
                jSONObject.getInt("vds");
            }
            if (jSONObject.has("vnt1")) {
                jSONObject.getInt("vnt1");
            }
            if (jSONObject.has("vnt2")) {
                jSONObject.getInt("vnt2");
            }
            if (jSONObject.has("vndis")) {
                jSONObject.getInt("vndis");
            }
            if (jSONObject.has("vir")) {
                jSONObject.getInt("vir");
            }
            if (jSONObject.has("vzo")) {
                jSONObject.getInt("vzo");
            }
            if (jSONObject.has("vte")) {
                jSONObject.getInt("vte");
            }
            if (jSONObject.has("vgs")) {
                jSONObject.getInt("vgs");
            }
            if (jSONObject.has("vdt")) {
                jSONObject.getInt("vdt");
            }
            if (jSONObject.has("voc")) {
                jSONObject.getInt("voc");
            }
            if (jSONObject.has("gdco")) {
                jSONObject.getInt("gdco");
            }
            if (jSONObject.has("sopt")) {
                jSONObject.getInt("sopt");
            }
            if (jSONObject.has("vsd")) {
                jSONObject.getInt("vsd");
            }
            if (jSONObject.has("vtast")) {
                jSONObject.getInt("vtast");
            }
            if (jSONObject.has("otd")) {
                jSONObject.getInt("otd");
            }
            if (jSONObject.has("atrf")) {
                jSONObject.getInt("atrf");
            }
            if (jSONObject.has("mdin")) {
                jSONObject.getInt("mdin");
            }
            if (jSONObject.has("dmd")) {
                jSONObject.getInt("dmd");
            }
            if (jSONObject.has("tunnel_vl")) {
                jSONObject.getDouble("tunnel_vl");
            }
            if (jSONObject.has("vtarm")) {
                jSONObject.getDouble("vtarm");
            }
            if (jSONObject.has("pms")) {
                jSONObject.getInt("pms");
            }
            if (jSONObject.has("ipblo")) {
                jSONObject.getInt("ipblo");
            }
            if (jSONObject.has("ipbwn")) {
                jSONObject.getInt("ipbwn");
            }
            if (jSONObject.has("ipbdalp")) {
                jSONObject.getInt("ipbdalp");
            }
            if (jSONObject.has("ipbalp")) {
                jSONObject.getDouble("ipbalp");
            }
            if (jSONObject.has("ipbmt")) {
                jSONObject.getDouble("ipbmt");
            }
            if (jSONObject.has("ipbmth")) {
                jSONObject.getDouble("ipbmth");
            }
            if (jSONObject.has("ews")) {
                jSONObject.getInt("ews");
            }
            if (jSONObject.has("mds")) {
                jSONObject.getInt("mds");
            }
            if (jSONObject.has("nps")) {
                jSONObject.getInt("nps");
            }
            if (jSONObject.has("raws")) {
                jSONObject.getInt("raws");
            }
            if (jSONObject.has("rawp")) {
                try {
                    jSONObject.optDouble("rawp");
                } catch (Exception unused4) {
                }
            }
            if (jSONObject.has("tspp")) {
                str = "vdt";
                try {
                    jSONObject.optInt("tspp", 0);
                } catch (Exception unused5) {
                }
            } else {
                str = "vdt";
            }
            if (jSONObject.has("ircbms")) {
                try {
                    jSONObject.optInt("ircbms", 0);
                } catch (Exception unused6) {
                }
            }
            if (jSONObject.has("dbds")) {
                try {
                    jSONObject.optInt("dbds", -1);
                } catch (Exception unused7) {
                }
            }
            if (jSONObject.has("spic")) {
                String strOptString2 = jSONObject.optString("spic", this.I);
                if (!TextUtils.isEmpty(strOptString2)) {
                    this.I = strOptString2;
                }
            }
            if (jSONObject.has("total_spic")) {
                try {
                    jSONObject.optInt("total_spic", 0);
                } catch (Exception unused8) {
                }
            }
            if (jSONObject.has("total_spic_2")) {
                try {
                    jSONObject.optInt("total_spic_2", 0);
                } catch (Exception unused9) {
                }
            }
            if (jSONObject.has("cfgs_params_mode0_new")) {
                String string4 = jSONObject.getString("cfgs_params_mode0_new");
                if (TextUtils.isEmpty(string4) || !string4.contains("|")) {
                    b();
                } else {
                    String[] strArrSplit3 = string4.split("\\|");
                    this.p = new float[strArrSplit3.length];
                    for (int i2 = 0; i2 < strArrSplit3.length; i2++) {
                        try {
                            this.p[i2] = Float.parseFloat(strArrSplit3[i2]);
                        } catch (NumberFormatException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            } else {
                b();
            }
            if (jSONObject.has("cfgs_params_mode1")) {
                String string5 = jSONObject.getString("cfgs_params_mode1");
                if (TextUtils.isEmpty(string5) || !string5.contains("|")) {
                    c();
                } else {
                    String[] strArrSplit4 = string5.split("\\|");
                    this.q = new float[strArrSplit4.length];
                    for (int i3 = 0; i3 < strArrSplit4.length; i3++) {
                        try {
                            this.q[i3] = Float.parseFloat(strArrSplit4[i3]);
                        } catch (NumberFormatException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
            } else {
                c();
            }
            if (jSONObject.has("cfgs_params_mode2")) {
                String string6 = jSONObject.getString("cfgs_params_mode2");
                if (TextUtils.isEmpty(string6) || !string6.contains("|")) {
                    d();
                } else {
                    String[] strArrSplit5 = string6.split("\\|");
                    this.r = new float[strArrSplit5.length];
                    for (int i4 = 0; i4 < strArrSplit5.length; i4++) {
                        try {
                            this.r[i4] = Float.parseFloat(strArrSplit5[i4]);
                        } catch (NumberFormatException e4) {
                            e4.printStackTrace();
                        }
                    }
                }
            } else {
                d();
            }
            if (jSONObject.has("cfgs_params_mode4")) {
                String string7 = jSONObject.getString("cfgs_params_mode4");
                if (TextUtils.isEmpty(string7) || !string7.contains("|")) {
                    g();
                } else {
                    String[] strArrSplit6 = string7.split("\\|");
                    this.s = new float[strArrSplit6.length];
                    for (int i5 = 0; i5 < strArrSplit6.length; i5++) {
                        try {
                            this.s[i5] = Float.parseFloat(strArrSplit6[i5]);
                        } catch (NumberFormatException e5) {
                            e5.printStackTrace();
                        }
                    }
                }
            } else {
                g();
            }
            if (jSONObject.has("cfgs_params_mode5")) {
                String string8 = jSONObject.getString("cfgs_params_mode5");
                if (TextUtils.isEmpty(string8) || !string8.contains("|")) {
                    e();
                } else {
                    String[] strArrSplit7 = string8.split("\\|");
                    this.t = new float[strArrSplit7.length];
                    for (int i6 = 0; i6 < strArrSplit7.length; i6++) {
                        try {
                            this.t[i6] = Float.parseFloat(strArrSplit7[i6]);
                        } catch (NumberFormatException e6) {
                            e6.printStackTrace();
                        }
                    }
                }
            } else {
                e();
            }
            if (jSONObject.has("cfgs_params_mode6")) {
                String string9 = jSONObject.getString("cfgs_params_mode6");
                if (TextUtils.isEmpty(string9) || !string9.contains("|")) {
                    f();
                } else {
                    String[] strArrSplit8 = string9.split("\\|");
                    this.u = new float[strArrSplit8.length];
                    for (int i7 = 0; i7 < strArrSplit8.length; i7++) {
                        try {
                            this.u[i7] = Float.parseFloat(strArrSplit8[i7]);
                        } catch (NumberFormatException e7) {
                            e7.printStackTrace();
                        }
                    }
                }
            } else {
                f();
            }
            if (jSONObject.has("vsc") && (string = jSONObject.getString("vsc")) != null && string.contains(",")) {
                String[] strArrSplit9 = string.split(",");
                this.m = new int[strArrSplit9.length];
                int length = strArrSplit9.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length) {
                    String str3 = strArrSplit9[i8];
                    String[] strArr = strArrSplit9;
                    this.m[i9] = 0;
                    if (str3.length() > 0) {
                        try {
                            this.m[i9] = Integer.valueOf(str3).intValue();
                        } catch (Throwable unused10) {
                        }
                    }
                    i9++;
                    i8++;
                    strArrSplit9 = strArr;
                }
            }
            if (jSONObject.has("d")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("d");
                if (jSONObject2.has("vt")) {
                    jSONObject2.getInt("vt");
                }
                if (jSONObject2.has("vr")) {
                    jSONObject2.getInt("vr");
                }
                if (jSONObject2.has("vl")) {
                    jSONObject2.getInt("vl");
                }
                if (jSONObject2.has("vds")) {
                    jSONObject2.getInt("vds");
                }
                if (jSONObject2.has("vir")) {
                    jSONObject2.getInt("vir");
                }
                if (jSONObject2.has("vzo")) {
                    jSONObject2.getInt("vzo");
                }
                if (jSONObject2.has("vte")) {
                    jSONObject2.getInt("vte");
                }
                if (jSONObject2.has("vgs")) {
                    jSONObject2.getInt("vgs");
                }
                String str4 = str;
                if (jSONObject2.has(str4)) {
                    jSONObject2.getInt(str4);
                }
                if (jSONObject2.has("voc")) {
                    jSONObject2.getInt("voc");
                }
            }
            if (jSONObject.has("ao")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("ao");
                if (jSONObject3.has("rn0")) {
                    jSONObject3.getDouble("rn0");
                }
                if (jSONObject3.has("rn1")) {
                    jSONObject3.getDouble("rn1");
                }
                if (jSONObject3.has("rn2")) {
                    jSONObject3.getDouble("rn2");
                }
                if (jSONObject3.has("rv0")) {
                    jSONObject3.getDouble("rv0");
                }
                if (jSONObject3.has("rv1")) {
                    jSONObject3.getDouble("rv1");
                }
                if (jSONObject3.has("rv2")) {
                    jSONObject3.getDouble("rv2");
                }
                if (jSONObject3.has("rvb")) {
                    jSONObject3.getDouble("rvb");
                }
                if (jSONObject3.has("swt")) {
                    jSONObject3.getInt("swt");
                }
            }
            if (jSONObject.has("vcr")) {
                jSONObject.getInt("vcr");
            }
            if (jSONObject.has("vgrids")) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("vgrids");
                    int length2 = jSONArray.length();
                    for (int i10 = 0; i10 < length2; i10++) {
                        String[] strArrSplit10 = jSONArray.getString(i10).split(",");
                        if (strArrSplit10.length == 4) {
                            ArrayList<Float> arrayList = new ArrayList<>();
                            arrayList.add(Float.valueOf(strArrSplit10[0]));
                            arrayList.add(Float.valueOf(strArrSplit10[1]));
                            arrayList.add(Float.valueOf(strArrSplit10[2]));
                            arrayList.add(Float.valueOf(strArrSplit10[3]));
                            if (this.v == null) {
                                this.v = new ArrayList<>();
                            }
                            this.v.add(arrayList);
                        }
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
            if (jSONObject.has("net_vdr_polygon")) {
                try {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("net_vdr_polygon");
                    int length3 = jSONArray2.length();
                    for (int i11 = 0; i11 < length3; i11++) {
                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i11);
                        if (jSONObject4 != null && jSONObject4.has("x1") && jSONObject4.has("x2") && jSONObject4.has("y1") && jSONObject4.has("y2")) {
                            ArrayList<Double> arrayList2 = new ArrayList<>();
                            arrayList2.add(Double.valueOf(jSONObject4.getDouble("x1")));
                            arrayList2.add(Double.valueOf(jSONObject4.getDouble("y1")));
                            arrayList2.add(Double.valueOf(jSONObject4.getDouble("x2")));
                            arrayList2.add(Double.valueOf(jSONObject4.getDouble("y2")));
                            if (this.w == null) {
                                this.w = new ArrayList<>();
                            }
                            this.w.add(arrayList2);
                        }
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                if (jSONObject.has("pps")) {
                    jSONObject.getInt("pps");
                }
                if (jSONObject.has("ppsw")) {
                    jSONObject.getInt("ppsw");
                }
                if (jSONObject.has("ppsv")) {
                    jSONObject.getInt("ppsv");
                }
                if (jSONObject.has("ppsmt")) {
                    jSONObject.getInt("ppsmt");
                }
                if (jSONObject.has("ppst")) {
                    jSONObject.getInt("ppst");
                }
                if (jSONObject.has("spef")) {
                    jSONObject.getInt("spef");
                }
                if (jSONObject.has("ppsut")) {
                    jSONObject.getInt("ppsut");
                }
                if (jSONObject.has("csps")) {
                    jSONObject.getInt("csps");
                }
                if (jSONObject.has("cspd")) {
                    jSONObject.getInt("cspd");
                }
                if (jSONObject.has("cspr")) {
                    jSONObject.getDouble("cspr");
                }
                if (jSONObject.has("ntb")) {
                    jSONObject.getInt("ntb");
                }
                if (jSONObject.has("hcs")) {
                    jSONObject.getInt("hcs");
                }
                if (jSONObject.has("hss")) {
                    jSONObject.getInt("hss");
                }
                if (jSONObject.has("drs")) {
                    jSONObject.getInt("drs");
                }
                if (jSONObject.has("rfdd")) {
                    jSONObject.getInt("rfdd");
                }
                if (jSONObject.has("ncls")) {
                    jSONObject.getInt("ncls");
                }
                if (jSONObject.has("nclw")) {
                    jSONObject.getInt("nclw");
                }
                if (jSONObject.has("nvwst")) {
                    jSONObject.getInt("nvwst");
                }
                if (jSONObject.has("ctz")) {
                    jSONObject.getDouble("ctz");
                }
                if (jSONObject.has("cdt")) {
                    jSONObject.getInt("cdt");
                }
                if (jSONObject.has("ccfb")) {
                    jSONObject.getInt("ccfb");
                }
                if (jSONObject.has("epoch_switch")) {
                    jSONObject.optInt("epoch_switch", 0);
                }
                if (jSONObject.has("epoch_to")) {
                    jSONObject.optDouble("epoch_to", -1.0d);
                }
                if (jSONObject.has("cl_list_switch")) {
                    this.H = jSONObject.optInt("cl_list_switch", 0);
                }
                if (jSONObject.has("cell_number")) {
                    jSONObject.optInt("cell_number", 10);
                }
                if (jSONObject.has("loc_str_length")) {
                    jSONObject.optInt("loc_str_length", 4000);
                }
                if (jSONObject.has("hrck")) {
                    jSONObject.getString("hrck");
                }
                if (jSONObject.has("hmsk")) {
                    jSONObject.getString("hmsk");
                }
                if (jSONObject.has("rmsk")) {
                    jSONObject.getString("rmsk");
                }
                if (jSONObject.has("hpstdk")) {
                    jSONObject.getString("hpstdk");
                }
                if (jSONObject.has("doubt_loc_switch")) {
                    jSONObject.optInt("doubt_loc_switch", 0);
                }
                if (jSONObject.has("doubt_loc_time")) {
                    jSONObject.optInt("doubt_loc_time", 3600);
                }
                if (jSONObject.has("gps_pre_switch")) {
                    jSONObject.optInt("gps_pre_switch", 1);
                }
                if (jSONObject.has("net_pre_switch")) {
                    jSONObject.optInt("net_pre_switch", 1);
                }
                if (jSONObject.has("gps_pre_length")) {
                    jSONObject.optInt("gps_pre_length", 5);
                }
                if (jSONObject.has("net_pre_length")) {
                    jSONObject.optInt("net_pre_length", 5);
                }
            }
            try {
                if (jSONObject.has("iblqp")) {
                    String[] strArrSplit11 = jSONObject.optString("iblqp").split(",");
                    if (strArrSplit11.length >= 3) {
                        Integer.parseInt(strArrSplit11[0]);
                        Integer.parseInt(strArrSplit11[1]);
                        Integer.parseInt(strArrSplit11[2]);
                    }
                }
            } catch (Exception unused11) {
            }
            if (jSONObject.has("miytp")) {
                jSONObject.optInt("miytp");
            }
            if (jSONObject.has("itptn")) {
                jSONObject.optInt("itptn ");
            }
            if (jSONObject.has("new_cl_scan_switch")) {
                jSONObject.optInt("new_cl_scan_switch", 1);
            }
            if (jSONObject.has("new_cl_scan_time")) {
                jSONObject.optInt("new_cl_scan_time", 100);
            }
            if (jSONObject.has("click_nlp_switch")) {
                jSONObject.optInt("click_nlp_switch", 0);
            }
            if (jSONObject.has("irgs")) {
                jSONObject.optDouble("irgs");
            }
            if (jSONObject.has("pdr_indoor_switch")) {
                jSONObject.optInt("pdr_indoor_switch", 0);
            }
            if (jSONObject.has("ilprs")) {
                jSONObject.optInt("ilprs");
            }
            if (jSONObject.has("cell_scan_time")) {
                jSONObject.optLong("cell_scan_time", 30000L);
            }
            if (jSONObject.has("tunnel_mobile_switch")) {
                jSONObject.optInt("tunnel_mobile_switch", 0);
            }
            if (jSONObject.has("new_loc_cache_switch")) {
                jSONObject.optInt("new_loc_cache_switch", 1);
            }
            if (jSONObject.has("nc_same_rate")) {
                jSONObject.optDouble("nc_same_rate", 0.8d);
            }
            if (jSONObject.has("cl_str_change_rate")) {
                jSONObject.optDouble("cl_str_change_rate", 0.2d);
            }
            if (jSONObject.has("wf_high_freq_vdr_loss")) {
                jSONObject.optInt("wf_high_freq_vdr_loss", 0);
            }
            if (jSONObject.has("gnssods")) {
                jSONObject.optInt("gnssods");
            }
            if (jSONObject.has("rtdrns")) {
                jSONObject.optInt("rtdrns");
            }
            if (jSONObject.has("vcsrps")) {
                jSONObject.optInt("vcsrps");
            }
            if (jSONObject.has("nlp_loc_coarse")) {
                jSONObject.optInt("nlp_loc_coarse");
            }
            if (jSONObject.has("lspfnis")) {
                jSONObject.optInt("lspfnis", 1);
            }
            if (jSONObject.has("upload_ssid_switch")) {
                this.J = jSONObject.optInt("upload_ssid_switch", 1);
            }
            if (jSONObject.has("single_ssid_length_max")) {
                this.K = jSONObject.optInt("single_ssid_length_max", 30);
            }
            if (jSONObject.has("max_request_ssid_number")) {
                this.L = jSONObject.optInt("max_request_ssid_number", 64);
            }
            if (jSONObject.has("fix_telephony_crash")) {
                jSONObject.optInt("fix_telephony_crash", 1);
            }
            if (jSONObject.has("is_monitor_index")) {
                jSONObject.optInt("is_monitor_index", 0);
            }
            if (jSONObject.has("monitor_frequency")) {
                jSONObject.optInt("monitor_frequency", 60000);
            }
            if (jSONObject.has("iens")) {
                this.M = jSONObject.optInt("iens");
            }
            if (jSONObject.has("kahts")) {
                this.N = jSONObject.optInt("kahts");
            }
            if (jSONObject.has("nvlyps")) {
                jSONObject.optInt("nvlyps");
            }
            if (jSONObject.has("nvlypsl")) {
                jSONObject.optInt("nvlypsl");
            }
            if (jSONObject.has("nvlypsp")) {
                String strOptString3 = jSONObject.optString("nvlypsp");
                if (strOptString3.contains("\\|")) {
                    String[] strArrSplit12 = strOptString3.split("\\|");
                    if (strArrSplit12.length >= 2) {
                        Integer.parseInt(strArrSplit12[0]);
                        Integer.parseInt(strArrSplit12[1]);
                    }
                }
            }
            if (jSONObject.has("nvlgfs")) {
                jSONObject.optInt("nvlgfs");
            }
            if (jSONObject.has("sppfs")) {
                jSONObject.optInt("sppfs");
            }
            if (jSONObject.has("ipsd")) {
                jSONObject.optString("ipsd");
            }
            if (jSONObject.has("nipvgdt")) {
                jSONObject.optInt("nipvgdt");
            }
            if (jSONObject.has("nipvpyt")) {
                jSONObject.optInt("nipvpyt");
            }
            if (jSONObject.has("nipvdcf")) {
                jSONObject.optInt("nipvdcf");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void c() {
        String[] strArrSplit = "1|0.05|60|45|2|300|80|2|100|40|30|3|8|4050|5|5|0.1|1|1|0|0.325|0|0|0.5|1|6|15|10|0.05|10|10|1|5|10|10|30|5|5.5|1|0|1|40|0.5|120|180|20|200|300|600|2|10|2|4|1.02|0|0|20|10|60|2|100|2|10|1|20|1|0.2|0|0|0.5|0|1|1000|10|1|40|5|10|5|0.8|1|5|50|6|2|4|1|1|0|0|1|0.5|1|0|1|200|100|1".split("\\|");
        this.q = new float[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.q[i] = Float.parseFloat(strArrSplit[i]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.l = str;
    }

    public final void d() {
        String[] strArrSplit = "1|0.05|200|80|1|300|80|2|100|40|30|3|8|4050|5|30|0.1|1|1|0|0.325|0|0|0.5|1|5|15|10|0.05|10|10|1|5|10|10|30|5|5.5|1|0|1|40|0.5|120|180|20|200|300|600|2|10|2|4|1.02|0|0|20|10|60|2|100|2|10|1|20|0".split("\\|");
        this.r = new float[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.r[i] = Float.parseFloat(strArrSplit[i]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    public final void e() {
        String[] strArrSplit = "1|10000|90|5|3|3|85|87|5|10|15|8|5|5".split("\\|");
        this.t = new float[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.t[i] = Float.parseFloat(strArrSplit[i]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    public final void f() {
        String[] strArrSplit = "1|0.05|60|45|2|300|80|2|100|40|30|3|8|4050|5|5|0.1|1|1|0|0.325|0|0|0.5|1|6|15|10|0.05|10|10|1|5|10|10|30|5|5.5|1|0|1|40|0.5|120|180|20|200|300|600|2|10|2|4|1.02|0|0|20|10|60|2|100|2|10|1|20|1|0.2|0|0|0.5|0|1|1000|10|1|40|5|10|5|0.8|1|5|50|6|2|4|1|1|0|0|1|0.5|1|0|1|200|100|1".split("\\|");
        this.u = new float[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.u[i] = Float.parseFloat(strArrSplit[i]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    public final void g() {
        String[] strArrSplit = "1|0.05|30|25|1|15|80|2|100|40|30|3|8|4050|10|7|0.1|1|1|0.1|0.325|0|0|0.5|1|6|15|10|0.05|10|10|1|5|10|10|30|5|5.5|1|0|1|40|0.5|120|180|20|200|300|600|2|10|2|4|1.02|0|0|20|10|60|2|100|2|10|1|20|0|1|1|0|1".split("\\|");
        this.s = new float[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.s[i] = Float.parseFloat(strArrSplit[i]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    public void h() {
        if (this.k == null) {
            this.k = new Handler();
        }
        boolean z = true;
        boolean z2 = System.currentTimeMillis() - this.j > 86400000;
        String strA = r.a().a("vdrconfig_gz", "");
        if (strA != null && !"".equals(strA)) {
            z = z2;
        }
        if (z) {
            this.j = System.currentTimeMillis();
            r.a().b("vdrtt", this.j);
            Handler handler = this.k;
            if (handler != null) {
                handler.postDelayed(new a(), 5000L);
            }
        }
    }
}
