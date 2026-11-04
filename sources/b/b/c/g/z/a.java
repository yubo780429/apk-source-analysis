package b.b.c.g.z;

import android.graphics.Rect;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f1136a;

    private a(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1136a = accessibilityNodeInfo;
    }

    public static a a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new a(accessibilityNodeInfo);
    }

    private static String b(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    public int a() {
        return this.f1136a.getActions();
    }

    public void a(int i) {
        this.f1136a.addAction(i);
    }

    public void a(Rect rect) {
        this.f1136a.getBoundsInParent(rect);
    }

    public void a(CharSequence charSequence) {
        this.f1136a.setClassName(charSequence);
    }

    public void a(boolean z) {
        this.f1136a.setScrollable(z);
    }

    public CharSequence b() {
        return this.f1136a.getClassName();
    }

    public void b(Rect rect) {
        this.f1136a.getBoundsInScreen(rect);
    }

    public CharSequence c() {
        return this.f1136a.getContentDescription();
    }

    public CharSequence d() {
        return this.f1136a.getPackageName();
    }

    public CharSequence e() {
        return this.f1136a.getText();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1136a;
        if (accessibilityNodeInfo == null) {
            if (aVar.f1136a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(aVar.f1136a)) {
            return false;
        }
        return true;
    }

    public String f() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f1136a.getViewIdResourceName();
        }
        return null;
    }

    public boolean g() {
        return this.f1136a.isCheckable();
    }

    public boolean h() {
        return this.f1136a.isChecked();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1136a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean i() {
        return this.f1136a.isClickable();
    }

    public boolean j() {
        return this.f1136a.isEnabled();
    }

    public boolean k() {
        return this.f1136a.isFocusable();
    }

    public boolean l() {
        return this.f1136a.isFocused();
    }

    public boolean m() {
        return this.f1136a.isLongClickable();
    }

    public boolean n() {
        return this.f1136a.isPassword();
    }

    public boolean o() {
        return this.f1136a.isScrollable();
    }

    public boolean p() {
        return this.f1136a.isSelected();
    }

    public AccessibilityNodeInfo q() {
        return this.f1136a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        sb.append("; boundsInParent: " + rect);
        b(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(d());
        sb.append("; className: ");
        sb.append(b());
        sb.append("; text: ");
        sb.append(e());
        sb.append("; contentDescription: ");
        sb.append(c());
        sb.append("; viewId: ");
        sb.append(f());
        sb.append("; checkable: ");
        sb.append(g());
        sb.append("; checked: ");
        sb.append(h());
        sb.append("; focusable: ");
        sb.append(k());
        sb.append("; focused: ");
        sb.append(l());
        sb.append("; selected: ");
        sb.append(p());
        sb.append("; clickable: ");
        sb.append(i());
        sb.append("; longClickable: ");
        sb.append(m());
        sb.append("; enabled: ");
        sb.append(j());
        sb.append("; password: ");
        sb.append(n());
        sb.append("; scrollable: " + o());
        sb.append("; [");
        int iA = a();
        while (iA != 0) {
            int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(iA);
            iA &= ~iNumberOfTrailingZeros;
            sb.append(b(iNumberOfTrailingZeros));
            if (iA != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
