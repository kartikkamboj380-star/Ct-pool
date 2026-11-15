.class public final Lcom/swmansion/rnscreens/ModalScreenViewManager;
.super Lcom/swmansion/rnscreens/ScreenViewManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/ModalScreenViewManager$a;
    }
.end annotation

.annotation runtime Li2/a;
    name = "RNSModalScreen"
.end annotation


# static fields
.field public static final Companion:Lcom/swmansion/rnscreens/ModalScreenViewManager$a;

.field public static final REACT_CLASS:Ljava/lang/String; = "RNSModalScreen"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/swmansion/rnscreens/ModalScreenViewManager$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/ModalScreenViewManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/swmansion/rnscreens/ModalScreenViewManager;->Companion:Lcom/swmansion/rnscreens/ModalScreenViewManager$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/swmansion/rnscreens/ScreenViewManager;-><init>()V

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RNSModalScreen"

    return-object v0
.end method

.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/q;->removeAllViews(Landroid/view/View;)V

    return-void
.end method
