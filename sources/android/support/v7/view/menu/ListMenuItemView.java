package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.t0;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements p.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f739c;
    private RadioButton d;
    private TextView e;
    private CheckBox f;
    private TextView g;
    private ImageView h;
    private ImageView i;
    private LinearLayout j;
    private Drawable k;
    private int l;
    private Context m;
    private boolean n;
    private Drawable o;
    private boolean p;
    private LayoutInflater q;
    private boolean r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.b.d.a.a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        t0 t0VarA = t0.a(getContext(), attributeSet, b.b.d.a.j.MenuView, i, 0);
        this.k = t0VarA.b(b.b.d.a.j.MenuView_android_itemBackground);
        this.l = t0VarA.g(b.b.d.a.j.MenuView_android_itemTextAppearance, -1);
        this.n = t0VarA.a(b.b.d.a.j.MenuView_preserveIconSpacing, false);
        this.m = context;
        this.o = t0VarA.b(b.b.d.a.j.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, b.b.d.a.a.dropDownListViewStyle, 0);
        this.p = typedArrayObtainStyledAttributes.hasValue(0);
        t0VarA.a();
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(b.b.d.a.g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f = checkBox;
        a(checkBox);
    }

    private void a(View view) {
        a(view, -1);
    }

    private void a(View view, int i) {
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    private void b() {
        ImageView imageView = (ImageView) getInflater().inflate(b.b.d.a.g.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f739c = imageView;
        a(imageView, 0);
    }

    private void d() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(b.b.d.a.g.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.d = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.support.v7.view.menu.p.a
    public void a(j jVar, int i) {
        this.f738b = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        setTitle(jVar.a(this));
        setCheckable(jVar.isCheckable());
        a(jVar.m(), jVar.d());
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    public void a(boolean z, char c2) {
        int i = (z && this.f738b.m()) ? 0 : 8;
        if (i == 0) {
            this.g.setText(this.f738b.e());
        }
        if (this.g.getVisibility() != i) {
            this.g.setVisibility(i);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
        rect.top += this.i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.support.v7.view.menu.p.a
    public boolean c() {
        return false;
    }

    @Override // android.support.v7.view.menu.p.a
    public j getItemData() {
        return this.f738b;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        b.b.c.g.q.a(this, this.k);
        TextView textView = (TextView) findViewById(b.b.d.a.f.title);
        this.e = textView;
        int i = this.l;
        if (i != -1) {
            textView.setTextAppearance(this.m, i);
        }
        this.g = (TextView) findViewById(b.b.d.a.f.shortcut);
        ImageView imageView = (ImageView) findViewById(b.b.d.a.f.submenuarrow);
        this.h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.o);
        }
        this.i = (ImageView) findViewById(b.b.d.a.f.group_divider);
        this.j = (LinearLayout) findViewById(b.b.d.a.f.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f739c != null && this.n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f739c.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.d == null && this.f == null) {
            return;
        }
        if (this.f738b.i()) {
            if (this.d == null) {
                d();
            }
            compoundButton = this.d;
            compoundButton2 = this.f;
        } else {
            if (this.f == null) {
                a();
            }
            compoundButton = this.f;
            compoundButton2 = this.d;
        }
        if (z) {
            compoundButton.setChecked(this.f738b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f738b.i()) {
            if (this.d == null) {
                d();
            }
            compoundButton = this.d;
        } else {
            if (this.f == null) {
                a();
            }
            compoundButton = this.f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.r = z;
        this.n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility((this.p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f738b.l() || this.r;
        if (z || this.n) {
            if (this.f739c == null && drawable == null && !this.n) {
                return;
            }
            if (this.f739c == null) {
                b();
            }
            if (drawable == null && !this.n) {
                this.f739c.setVisibility(8);
                return;
            }
            ImageView imageView = this.f739c;
            if (!z) {
                drawable = null;
            }
            imageView.setImageDrawable(drawable);
            if (this.f739c.getVisibility() != 0) {
                this.f739c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.e.getVisibility() != 8) {
                this.e.setVisibility(8);
            }
        } else {
            this.e.setText(charSequence);
            if (this.e.getVisibility() != 0) {
                this.e.setVisibility(0);
            }
        }
    }
}
