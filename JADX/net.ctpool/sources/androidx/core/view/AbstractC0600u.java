package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import v.InterfaceMenuItemC2150b;

/* JADX INFO: renamed from: androidx.core.view.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0600u {

    /* JADX INFO: renamed from: androidx.core.view.u$a */
    static class a {
        static int a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        static CharSequence b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        static ColorStateList c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        static PorterDuff.Mode d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        static int e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        static CharSequence f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        static MenuItem g(MenuItem menuItem, char c7, int i7) {
            return menuItem.setAlphabeticShortcut(c7, i7);
        }

        static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        static MenuItem k(MenuItem menuItem, char c7, int i7) {
            return menuItem.setNumericShortcut(c7, i7);
        }

        static MenuItem l(MenuItem menuItem, char c7, char c8, int i7, int i8) {
            return menuItem.setShortcut(c7, c8, i7, i8);
        }

        static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    public static MenuItem a(MenuItem menuItem, AbstractC0582b abstractC0582b) {
        if (menuItem instanceof InterfaceMenuItemC2150b) {
            return ((InterfaceMenuItemC2150b) menuItem).a(abstractC0582b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void b(MenuItem menuItem, char c7, int i7) {
        if (menuItem instanceof InterfaceMenuItemC2150b) {
            ((InterfaceMenuItemC2150b) menuItem).setAlphabeticShortcut(c7, i7);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.g(menuItem, c7, i7);
        }
    }

    public static void c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC2150b) {
            ((InterfaceMenuItemC2150b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.h(menuItem, charSequence);
        }
    }

    public static void d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC2150b) {
            ((InterfaceMenuItemC2150b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.i(menuItem, colorStateList);
        }
    }

    public static void e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC2150b) {
            ((InterfaceMenuItemC2150b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.j(menuItem, mode);
        }
    }

    public static void f(MenuItem menuItem, char c7, int i7) {
        if (menuItem instanceof InterfaceMenuItemC2150b) {
            ((InterfaceMenuItemC2150b) menuItem).setNumericShortcut(c7, i7);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.k(menuItem, c7, i7);
        }
    }

    public static void g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC2150b) {
            ((InterfaceMenuItemC2150b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m(menuItem, charSequence);
        }
    }
}
