.class public final Lcom/swmansion/rnscreens/SearchBarManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "SourceFile"

# interfaces
.implements LF2/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/SearchBarManager$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/swmansion/rnscreens/K;",
        ">;",
        "LF2/u;"
    }
.end annotation

.annotation runtime Li2/a;
    name = "RNSSearchBar"
.end annotation


# static fields
.field public static final Companion:Lcom/swmansion/rnscreens/SearchBarManager$a;

.field public static final REACT_CLASS:Ljava/lang/String; = "RNSSearchBar"


# instance fields
.field private final delegate:Lcom/facebook/react/uimanager/A0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/uimanager/A0;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/swmansion/rnscreens/SearchBarManager$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/SearchBarManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/swmansion/rnscreens/SearchBarManager;->Companion:Lcom/swmansion/rnscreens/SearchBarManager$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>()V

    new-instance v0, LF2/t;

    invoke-direct {v0, p0}, LF2/t;-><init>(Lcom/facebook/react/uimanager/g;)V

    iput-object v0, p0, Lcom/swmansion/rnscreens/SearchBarManager;->delegate:Lcom/facebook/react/uimanager/A0;

    return-void
.end method

.method private final logNotAvailable(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " prop is not available on Android"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "[RNScreens]"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public bridge synthetic blur(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/SearchBarManager;->blur(Lcom/swmansion/rnscreens/K;)V

    return-void
.end method

.method public blur(Lcom/swmansion/rnscreens/K;)V
    .locals 0

    .line 2
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/K;->z()V

    :cond_0
    return-void
.end method

.method public bridge synthetic cancelSearch(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/SearchBarManager;->cancelSearch(Lcom/swmansion/rnscreens/K;)V

    return-void
.end method

.method public cancelSearch(Lcom/swmansion/rnscreens/K;)V
    .locals 0

    .line 2
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/K;->D()V

    :cond_0
    return-void
.end method

.method public bridge synthetic clearText(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/SearchBarManager;->clearText(Lcom/swmansion/rnscreens/K;)V

    return-void
.end method

.method public clearText(Lcom/swmansion/rnscreens/K;)V
    .locals 0

    .line 2
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/K;->A()V

    :cond_0
    return-void
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/e0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/SearchBarManager;->createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/swmansion/rnscreens/K;

    move-result-object p1

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/swmansion/rnscreens/K;
    .locals 1

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/swmansion/rnscreens/K;

    invoke-direct {v0, p1}, Lcom/swmansion/rnscreens/K;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0
.end method

.method public bridge synthetic focus(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/SearchBarManager;->focus(Lcom/swmansion/rnscreens/K;)V

    return-void
.end method

.method public focus(Lcom/swmansion/rnscreens/K;)V
    .locals 0

    .line 2
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/K;->D()V

    :cond_0
    return-void
.end method

.method protected getDelegate()Lcom/facebook/react/uimanager/A0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/A0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/swmansion/rnscreens/SearchBarManager;->delegate:Lcom/facebook/react/uimanager/A0;

    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "onSearchBlur"

    const-string v1, "registrationName"

    invoke-static {v1, v0}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    const-string v0, "onChangeText"

    invoke-static {v1, v0}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v5

    const-string v0, "onClose"

    invoke-static {v1, v0}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v7

    const-string v0, "onSearchFocus"

    invoke-static {v1, v0}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v9

    const-string v0, "onOpen"

    invoke-static {v1, v0}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v11

    const-string v0, "onSearchButtonPress"

    invoke-static {v1, v0}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v13

    const-string v2, "topSearchBlur"

    const-string v4, "topChangeText"

    const-string v6, "topClose"

    const-string v8, "topSearchFocus"

    const-string v10, "topOpen"

    const-string v12, "topSearchButtonPress"

    invoke-static/range {v2 .. v13}, LS1/f;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RNSSearchBar"

    return-object v0
.end method

.method public bridge synthetic onAfterUpdateTransaction(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/SearchBarManager;->onAfterUpdateTransaction(Lcom/swmansion/rnscreens/K;)V

    return-void
.end method

.method protected onAfterUpdateTransaction(Lcom/swmansion/rnscreens/K;)V
    .locals 1

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManager;->onAfterUpdateTransaction(Landroid/view/View;)V

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/K;->J()V

    return-void
.end method

.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/q;->removeAllViews(Landroid/view/View;)V

    return-void
.end method

.method public bridge synthetic setAutoCapitalize(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/SearchBarManager;->setAutoCapitalize(Lcom/swmansion/rnscreens/K;Ljava/lang/String;)V

    return-void
.end method

.method public setAutoCapitalize(Lcom/swmansion/rnscreens/K;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "autoCapitalize"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "characters"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lcom/swmansion/rnscreens/K$a;->p:Lcom/swmansion/rnscreens/K$a;

    goto :goto_2

    :sswitch_1
    const-string v0, "sentences"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lcom/swmansion/rnscreens/K$a;->o:Lcom/swmansion/rnscreens/K$a;

    goto :goto_2

    :sswitch_2
    const-string v0, "words"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lcom/swmansion/rnscreens/K$a;->n:Lcom/swmansion/rnscreens/K$a;

    goto :goto_2

    :sswitch_3
    const-string v0, "none"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    new-instance p1, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    const-string p2, "Forbidden auto capitalize value passed"

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_1
    sget-object p2, Lcom/swmansion/rnscreens/K$a;->m:Lcom/swmansion/rnscreens/K$a;

    :goto_2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/K;->setAutoCapitalize(Lcom/swmansion/rnscreens/K$a;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x33af38 -> :sswitch_3
        0x6c11aa9 -> :sswitch_2
        0x1d36f670 -> :sswitch_1
        0x4a3baa6a -> :sswitch_0
    .end sparse-switch
.end method

.method public final setAutoFocus(Lcom/swmansion/rnscreens/K;Ljava/lang/Boolean;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "autoFocus"
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/K;->setAutoFocus(Z)V

    return-void
.end method

.method public bridge synthetic setBarTintColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/SearchBarManager;->setBarTintColor(Lcom/swmansion/rnscreens/K;Ljava/lang/Integer;)V

    return-void
.end method

.method public setBarTintColor(Lcom/swmansion/rnscreens/K;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "barTintColor"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/K;->setTintColor(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic setCancelButtonText(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/SearchBarManager;->setCancelButtonText(Lcom/swmansion/rnscreens/K;Ljava/lang/String;)V

    return-void
.end method

.method public setCancelButtonText(Lcom/swmansion/rnscreens/K;Ljava/lang/String;)V
    .locals 0

    .line 2
    const-string p1, "cancelButtonText"

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/SearchBarManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setDisableBackButtonOverride(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/SearchBarManager;->setDisableBackButtonOverride(Lcom/swmansion/rnscreens/K;Z)V

    return-void
.end method

.method public setDisableBackButtonOverride(Lcom/swmansion/rnscreens/K;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "disableBackButtonOverride"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/swmansion/rnscreens/K;->setShouldOverrideBackButton(Z)V

    return-void
.end method

.method public bridge synthetic setHeaderIconColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/SearchBarManager;->setHeaderIconColor(Lcom/swmansion/rnscreens/K;Ljava/lang/Integer;)V

    return-void
.end method

.method public setHeaderIconColor(Lcom/swmansion/rnscreens/K;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "headerIconColor"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/K;->setHeaderIconColor(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic setHideNavigationBar(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/SearchBarManager;->setHideNavigationBar(Lcom/swmansion/rnscreens/K;Z)V

    return-void
.end method

.method public setHideNavigationBar(Lcom/swmansion/rnscreens/K;Z)V
    .locals 0

    .line 2
    const-string p1, "hideNavigationBar"

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/SearchBarManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setHideWhenScrolling(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/SearchBarManager;->setHideWhenScrolling(Lcom/swmansion/rnscreens/K;Z)V

    return-void
.end method

.method public setHideWhenScrolling(Lcom/swmansion/rnscreens/K;Z)V
    .locals 0

    .line 2
    const-string p1, "hideWhenScrolling"

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/SearchBarManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setHintTextColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/SearchBarManager;->setHintTextColor(Lcom/swmansion/rnscreens/K;Ljava/lang/Integer;)V

    return-void
.end method

.method public setHintTextColor(Lcom/swmansion/rnscreens/K;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "hintTextColor"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/K;->setHintTextColor(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic setInputType(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/SearchBarManager;->setInputType(Lcom/swmansion/rnscreens/K;Ljava/lang/String;)V

    return-void
.end method

.method public setInputType(Lcom/swmansion/rnscreens/K;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "inputType"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "phone"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lcom/swmansion/rnscreens/K$b;->n:Lcom/swmansion/rnscreens/K$b;

    goto :goto_2

    :sswitch_1
    const-string v0, "email"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lcom/swmansion/rnscreens/K$b;->p:Lcom/swmansion/rnscreens/K$b;

    goto :goto_2

    :sswitch_2
    const-string v0, "text"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_1

    :sswitch_3
    const-string v0, "number"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lcom/swmansion/rnscreens/K$b;->o:Lcom/swmansion/rnscreens/K$b;

    goto :goto_2

    :cond_0
    :goto_0
    new-instance p1, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    const-string p2, "Forbidden input type value"

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_1
    sget-object p2, Lcom/swmansion/rnscreens/K$b;->m:Lcom/swmansion/rnscreens/K$b;

    :goto_2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/K;->setInputType(Lcom/swmansion/rnscreens/K$b;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3da724b7 -> :sswitch_3
        0x36452d -> :sswitch_2
        0x5c24b9c -> :sswitch_1
        0x65b3d6e -> :sswitch_0
    .end sparse-switch
.end method

.method public bridge synthetic setObscureBackground(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/SearchBarManager;->setObscureBackground(Lcom/swmansion/rnscreens/K;Z)V

    return-void
.end method

.method public setObscureBackground(Lcom/swmansion/rnscreens/K;Z)V
    .locals 0

    .line 2
    const-string p1, "hideNavigationBar"

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/SearchBarManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setPlaceholder(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/SearchBarManager;->setPlaceholder(Lcom/swmansion/rnscreens/K;Ljava/lang/String;)V

    return-void
.end method

.method public setPlaceholder(Lcom/swmansion/rnscreens/K;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "placeholder"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/K;->setPlaceholder(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setPlacement(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/SearchBarManager;->setPlacement(Lcom/swmansion/rnscreens/K;Ljava/lang/String;)V

    return-void
.end method

.method public setPlacement(Lcom/swmansion/rnscreens/K;Ljava/lang/String;)V
    .locals 0

    .line 2
    const-string p2, "view"

    invoke-static {p1, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "setPlacement"

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/SearchBarManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setShouldShowHintSearchIcon(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/SearchBarManager;->setShouldShowHintSearchIcon(Lcom/swmansion/rnscreens/K;Z)V

    return-void
.end method

.method public setShouldShowHintSearchIcon(Lcom/swmansion/rnscreens/K;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "shouldShowHintSearchIcon"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/K;->setShouldShowHintSearchIcon(Z)V

    return-void
.end method

.method public bridge synthetic setText(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/SearchBarManager;->setText(Lcom/swmansion/rnscreens/K;Ljava/lang/String;)V

    return-void
.end method

.method public setText(Lcom/swmansion/rnscreens/K;Ljava/lang/String;)V
    .locals 0

    .line 2
    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/K;->F(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setTextColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/SearchBarManager;->setTextColor(Lcom/swmansion/rnscreens/K;Ljava/lang/Integer;)V

    return-void
.end method

.method public setTextColor(Lcom/swmansion/rnscreens/K;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "textColor"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/K;->setTextColor(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic setTintColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/SearchBarManager;->setTintColor(Lcom/swmansion/rnscreens/K;Ljava/lang/Integer;)V

    return-void
.end method

.method public setTintColor(Lcom/swmansion/rnscreens/K;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    const-string p1, "tintColor"

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/SearchBarManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic toggleCancelButton(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/K;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/SearchBarManager;->toggleCancelButton(Lcom/swmansion/rnscreens/K;Z)V

    return-void
.end method

.method public toggleCancelButton(Lcom/swmansion/rnscreens/K;Z)V
    .locals 0

    .line 2
    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/K;->I(Z)V

    :cond_0
    return-void
.end method
