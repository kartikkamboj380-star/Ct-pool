.class public final Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "SourceFile"

# interfaces
.implements LF2/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/swmansion/rnscreens/y;",
        ">;",
        "LF2/r;"
    }
.end annotation

.annotation runtime Li2/a;
    name = "RNSScreenStackHeaderSubview"
.end annotation


# static fields
.field public static final Companion:Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager$a;

.field public static final REACT_CLASS:Ljava/lang/String; = "RNSScreenStackHeaderSubview"


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

    new-instance v0, Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;->Companion:Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>()V

    new-instance v0, LF2/q;

    invoke-direct {v0, p0}, LF2/q;-><init>(Lcom/facebook/react/uimanager/g;)V

    iput-object v0, p0, Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;->delegate:Lcom/facebook/react/uimanager/A0;

    return-void
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/e0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;->createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/swmansion/rnscreens/y;

    move-result-object p1

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/swmansion/rnscreens/y;
    .locals 1

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/swmansion/rnscreens/y;

    invoke-direct {v0, p1}, Lcom/swmansion/rnscreens/y;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0
.end method

.method protected getDelegate()Lcom/facebook/react/uimanager/A0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/A0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;->delegate:Lcom/facebook/react/uimanager/A0;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RNSScreenStackHeaderSubview"

    return-object v0
.end method

.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/q;->removeAllViews(Landroid/view/View;)V

    return-void
.end method

.method public bridge synthetic setType(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/y;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;->setType(Lcom/swmansion/rnscreens/y;Ljava/lang/String;)V

    return-void
.end method

.method public setType(Lcom/swmansion/rnscreens/y;Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "type"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v0, "searchBar"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lcom/swmansion/rnscreens/y$a;->q:Lcom/swmansion/rnscreens/y$a;

    goto :goto_0

    :sswitch_1
    const-string v0, "right"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lcom/swmansion/rnscreens/y$a;->o:Lcom/swmansion/rnscreens/y$a;

    goto :goto_0

    :sswitch_2
    const-string v0, "left"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lcom/swmansion/rnscreens/y$a;->m:Lcom/swmansion/rnscreens/y$a;

    goto :goto_0

    :sswitch_3
    const-string v0, "back"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lcom/swmansion/rnscreens/y$a;->p:Lcom/swmansion/rnscreens/y$a;

    goto :goto_0

    :sswitch_4
    const-string v0, "center"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lcom/swmansion/rnscreens/y$a;->n:Lcom/swmansion/rnscreens/y$a;

    :goto_0
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/y;->setType(Lcom/swmansion/rnscreens/y$a;)V

    return-void

    :cond_0
    :goto_1
    new-instance p1, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_data_0
    .sparse-switch
        -0x514d33ab -> :sswitch_4
        0x2e04e7 -> :sswitch_3
        0x32a007 -> :sswitch_2
        0x677c21c -> :sswitch_1
        0x69fcdd4b -> :sswitch_0
    .end sparse-switch
.end method
