.class public abstract Lcom/facebook/react/views/text/ReactTextAnchorViewManager;
.super Lcom/facebook/react/uimanager/BaseViewManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/view/View;",
        "C:",
        "Lcom/facebook/react/views/text/c;",
        ">",
        "Lcom/facebook/react/uimanager/BaseViewManager<",
        "TT;TC;>;"
    }
.end annotation


# static fields
.field private static final SPACING_TYPES:[I

.field private static final TAG:Ljava/lang/String; = "ReactTextAnchorViewManager"


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x3

    const/16 v2, 0x8

    const/4 v3, 0x0

    const/4 v4, 0x2

    filled-new-array {v2, v3, v4, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lcom/facebook/react/views/text/ReactTextAnchorViewManager;->SPACING_TYPES:[I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/BaseViewManager;-><init>()V

    return-void
.end method


# virtual methods
.method public setAccessible(Lcom/facebook/react/views/text/m;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "accessible"
    .end annotation

    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusable(Z)V

    return-void
.end method

.method public setAdjustFontSizeToFit(Lcom/facebook/react/views/text/m;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "adjustsFontSizeToFit"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/text/m;->setAdjustFontSizeToFit(Z)V

    return-void
.end method

.method public setAndroidHyphenationFrequency(Lcom/facebook/react/views/text/m;Ljava/lang/String;)V
    .locals 3
    .annotation runtime Lx2/a;
        name = "android_hyphenationFrequency"
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_3

    const-string v1, "none"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, "full"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p2, 0x2

    :goto_0
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/text/m;->setHyphenationFrequency(I)V

    goto :goto_2

    :cond_1
    const-string v1, "normal"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 p2, 0x1

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid android_hyphenationFrequency: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "ReactNative"

    invoke-static {v1, p2}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_1
    invoke-virtual {p1, v0}, Lcom/facebook/react/views/text/m;->setHyphenationFrequency(I)V

    :goto_2
    return-void
.end method

.method public setBorderColor(Lcom/facebook/react/views/text/m;ILjava/lang/Integer;)V
    .locals 3
    .annotation runtime Lx2/b;
        customType = "Color"
        names = {
            "borderColor",
            "borderLeftColor",
            "borderRightColor",
            "borderTopColor",
            "borderBottomColor"
        }
    .end annotation

    const/high16 v0, 0x7fc00000    # Float.NaN

    if-nez p3, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const v2, 0xffffff

    and-int/2addr v1, v2

    int-to-float v1, v1

    :goto_0
    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    ushr-int/lit8 p3, p3, 0x18

    int-to-float v0, p3

    :goto_1
    sget-object p3, Lcom/facebook/react/views/text/ReactTextAnchorViewManager;->SPACING_TYPES:[I

    aget p2, p3, p2

    invoke-virtual {p1, p2, v1, v0}, Lcom/facebook/react/views/text/m;->v(IFF)V

    return-void
.end method

.method public setBorderRadius(Lcom/facebook/react/views/text/m;IF)V
    .locals 1
    .annotation runtime Lx2/b;
        defaultFloat = NaNf
        names = {
            "borderRadius",
            "borderTopLeftRadius",
            "borderTopRightRadius",
            "borderBottomRightRadius",
            "borderBottomLeftRadius"
        }
    .end annotation

    invoke-static {p3}, Lcom/facebook/yoga/g;->a(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p3}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p3

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p1, p3}, Lcom/facebook/react/views/text/m;->setBorderRadius(F)V

    goto :goto_0

    :cond_1
    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p3, p2}, Lcom/facebook/react/views/text/m;->w(FI)V

    :goto_0
    return-void
.end method

.method public setBorderStyle(Lcom/facebook/react/views/text/m;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "borderStyle"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/text/m;->setBorderStyle(Ljava/lang/String;)V

    return-void
.end method

.method public setBorderWidth(Lcom/facebook/react/views/text/m;IF)V
    .locals 1
    .annotation runtime Lx2/b;
        defaultFloat = NaNf
        names = {
            "borderWidth",
            "borderLeftWidth",
            "borderRightWidth",
            "borderTopWidth",
            "borderBottomWidth"
        }
    .end annotation

    invoke-static {p3}, Lcom/facebook/yoga/g;->a(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p3}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p3

    :cond_0
    sget-object v0, Lcom/facebook/react/views/text/ReactTextAnchorViewManager;->SPACING_TYPES:[I

    aget p2, v0, p2

    invoke-virtual {p1, p2, p3}, Lcom/facebook/react/views/text/m;->x(IF)V

    return-void
.end method

.method public setDataDetectorType(Lcom/facebook/react/views/text/m;Ljava/lang/String;)V
    .locals 5
    .annotation runtime Lx2/a;
        name = "dataDetectorType"
    .end annotation

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_4

    const/4 v3, -0x1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v4, "email"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_1
    const-string v4, "link"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    move v3, v0

    goto :goto_0

    :sswitch_2
    const-string v4, "all"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    move v3, v1

    goto :goto_0

    :sswitch_3
    const-string v4, "phoneNumber"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_0

    :cond_3
    move v3, v2

    :goto_0
    packed-switch v3, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    invoke-virtual {p1, v0}, Lcom/facebook/react/views/text/m;->setLinkifyMask(I)V

    return-void

    :pswitch_1
    invoke-virtual {p1, v1}, Lcom/facebook/react/views/text/m;->setLinkifyMask(I)V

    return-void

    :pswitch_2
    const/16 p2, 0xf

    :goto_1
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/text/m;->setLinkifyMask(I)V

    return-void

    :pswitch_3
    const/4 p2, 0x4

    goto :goto_1

    :cond_4
    :goto_2
    invoke-virtual {p1, v2}, Lcom/facebook/react/views/text/m;->setLinkifyMask(I)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x471b45a9 -> :sswitch_3
        0x179a1 -> :sswitch_2
        0x32affa -> :sswitch_1
        0x5c24b9c -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setDisabled(Lcom/facebook/react/views/text/m;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultBoolean = false
        name = "disabled"
    .end annotation

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public setEllipsizeMode(Lcom/facebook/react/views/text/m;Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "ellipsizeMode"
    .end annotation

    if-eqz p2, :cond_4

    const-string v0, "tail"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "head"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p2, Landroid/text/TextUtils$TruncateAt;->START:Landroid/text/TextUtils$TruncateAt;

    :goto_0
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/text/m;->setEllipsizeLocation(Landroid/text/TextUtils$TruncateAt;)V

    goto :goto_2

    :cond_1
    const-string v0, "middle"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p2, Landroid/text/TextUtils$TruncateAt;->MIDDLE:Landroid/text/TextUtils$TruncateAt;

    goto :goto_0

    :cond_2
    const-string v0, "clip"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p2, 0x0

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid ellipsizeMode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "ReactNative"

    invoke-static {v0, p2}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_1
    sget-object p2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    goto :goto_0

    :goto_2
    return-void
.end method

.method public setFontSize(Lcom/facebook/react/views/text/m;F)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "fontSize"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/text/m;->setFontSize(F)V

    return-void
.end method

.method public setIncludeFontPadding(Lcom/facebook/react/views/text/m;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultBoolean = true
        name = "includeFontPadding"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/text/m;->setIncludeFontPadding(Z)V

    return-void
.end method

.method public setLetterSpacing(Lcom/facebook/react/views/text/m;F)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultFloat = 0.0f
        name = "letterSpacing"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/text/m;->setLetterSpacing(F)V

    return-void
.end method

.method public setNotifyOnInlineViewLayout(Lcom/facebook/react/views/text/m;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "onInlineViewLayout"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/text/m;->setNotifyOnInlineViewLayout(Z)V

    return-void
.end method

.method public setNumberOfLines(Lcom/facebook/react/views/text/m;I)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultInt = 0x7fffffff
        name = "numberOfLines"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/text/m;->setNumberOfLines(I)V

    return-void
.end method

.method public setSelectable(Lcom/facebook/react/views/text/m;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "selectable"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/text/m;->setTextIsSelectable(Z)V

    return-void
.end method

.method public setSelectionColor(Lcom/facebook/react/views/text/m;Ljava/lang/Integer;)V
    .locals 0
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "selectionColor"
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/facebook/react/views/text/a;->c(Landroid/content/Context;)I

    move-result p2

    :goto_0
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setHighlightColor(I)V

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_0

    :goto_1
    return-void
.end method

.method public setTextAlignVertical(Lcom/facebook/react/views/text/m;Ljava/lang/String;)V
    .locals 3
    .annotation runtime Lx2/a;
        name = "textAlignVertical"
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    const-string v1, "auto"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, "top"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 p2, 0x30

    :goto_0
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/text/m;->setGravityVertical(I)V

    goto :goto_2

    :cond_1
    const-string v1, "bottom"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 p2, 0x50

    goto :goto_0

    :cond_2
    const-string v1, "center"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 p2, 0x10

    goto :goto_0

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid textAlignVertical: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "ReactNative"

    invoke-static {v1, p2}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_1
    invoke-virtual {p1, v0}, Lcom/facebook/react/views/text/m;->setGravityVertical(I)V

    :goto_2
    return-void
.end method
