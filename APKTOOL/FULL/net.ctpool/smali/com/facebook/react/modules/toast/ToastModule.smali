.class public final Lcom/facebook/react/modules/toast/ToastModule;
.super Lcom/facebook/fbreact/specs/NativeToastAndroidSpec;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/toast/ToastModule$a;
    }
.end annotation

.annotation runtime Li2/a;
    name = "ToastAndroid"
.end annotation


# static fields
.field public static final Companion:Lcom/facebook/react/modules/toast/ToastModule$a;

.field private static final DURATION_LONG_KEY:Ljava/lang/String; = "LONG"

.field private static final DURATION_SHORT_KEY:Ljava/lang/String; = "SHORT"

.field private static final GRAVITY_BOTTOM_KEY:Ljava/lang/String; = "BOTTOM"

.field private static final GRAVITY_CENTER:Ljava/lang/String; = "CENTER"

.field private static final GRAVITY_TOP_KEY:Ljava/lang/String; = "TOP"

.field public static final NAME:Ljava/lang/String; = "ToastAndroid"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/modules/toast/ToastModule$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/modules/toast/ToastModule$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/modules/toast/ToastModule;->Companion:Lcom/facebook/react/modules/toast/ToastModule$a;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeToastAndroidSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/facebook/react/modules/toast/ToastModule;->show$lambda$0(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/react/modules/toast/ToastModule;->showWithGravity$lambda$1(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;II)V

    return-void
.end method

.method public static synthetic c(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;IIII)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/facebook/react/modules/toast/ToastModule;->showWithGravityAndOffset$lambda$2(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;IIII)V

    return-void
.end method

.method private static final show$lambda$0(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;I)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p0

    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method private static final showWithGravity$lambda$1(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;II)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p0

    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p3, p1, p1}, Landroid/widget/Toast;->setGravity(III)V

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method private static final showWithGravityAndOffset$lambda$2(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;IIII)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p0

    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0, p3, p4, p5}, Landroid/widget/Toast;->setGravity(III)V

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void
.end method


# virtual methods
.method public getTypedExportedConstants()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "SHORT"

    invoke-static {v1, v0}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "LONG"

    invoke-static {v2, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v1

    const/16 v2, 0x31

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "TOP"

    invoke-static {v3, v2}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v2

    const/16 v3, 0x51

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "BOTTOM"

    invoke-static {v4, v3}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v3

    const/16 v4, 0x11

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "CENTER"

    invoke-static {v5, v4}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v4

    filled-new-array {v0, v1, v2, v3, v4}, [Li5/l;

    move-result-object v0

    invoke-static {v0}, Lj5/F;->j([Li5/l;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public show(Ljava/lang/String;D)V
    .locals 0

    double-to-int p2, p2

    new-instance p3, Lr2/c;

    invoke-direct {p3, p0, p1, p2}, Lr2/c;-><init>(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;I)V

    invoke-static {p3}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public showWithGravity(Ljava/lang/String;DD)V
    .locals 0

    double-to-int p2, p2

    double-to-int p3, p4

    new-instance p4, Lr2/b;

    invoke-direct {p4, p0, p1, p2, p3}, Lr2/b;-><init>(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;II)V

    invoke-static {p4}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public showWithGravityAndOffset(Ljava/lang/String;DDDD)V
    .locals 2

    double-to-int v0, p2

    double-to-int v1, p4

    double-to-int p7, p6

    double-to-int p8, p8

    new-instance p9, Lr2/a;

    move-object p2, p9

    move-object p3, p0

    move-object p4, p1

    move p5, v0

    move p6, v1

    invoke-direct/range {p2 .. p8}, Lr2/a;-><init>(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;IIII)V

    invoke-static {p9}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method
