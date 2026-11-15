package v;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.AbstractC0582b;

/* JADX INFO: renamed from: v.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceMenuItemC2150b extends MenuItem {
    InterfaceMenuItemC2150b a(AbstractC0582b abstractC0582b);

    AbstractC0582b b();

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i7);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c7, int i7);

    @Override // android.view.MenuItem
    InterfaceMenuItemC2150b setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c7, int i7);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c7, char c8, int i7, int i8);

    @Override // android.view.MenuItem
    void setShowAsAction(int i7);

    @Override // android.view.MenuItem
    MenuItem setShowAsActionFlags(int i7);

    @Override // android.view.MenuItem
    InterfaceMenuItemC2150b setTooltipText(CharSequence charSequence);
}
