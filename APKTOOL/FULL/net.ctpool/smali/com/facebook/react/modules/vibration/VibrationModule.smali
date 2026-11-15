.class public final Lcom/facebook/react/modules/vibration/VibrationModule;
.super Lcom/facebook/fbreact/specs/NativeVibrationSpec;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "MissingPermission"
    }
.end annotation

.annotation runtime Li2/a;
    name = "Vibration"
.end annotation


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeVibrationSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-void
.end method

.method private final getVibrator()Landroid/os/Vibrator;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    const-string v1, "vibrator_manager"

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ls2/d;->a(Ljava/lang/Object;)Landroid/os/VibratorManager;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Ls2/e;->a(Landroid/os/VibratorManager;)Landroid/os/Vibrator;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    const-string v1, "vibrator"

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    :goto_0
    return-object v0
.end method


# virtual methods
.method public cancel()V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/modules/vibration/VibrationModule;->getVibrator()Landroid/os/Vibrator;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/Vibrator;->cancel()V

    :cond_0
    return-void
.end method

.method public vibrate(D)V
    .locals 2

    double-to-int p1, p1

    invoke-direct {p0}, Lcom/facebook/react/modules/vibration/VibrationModule;->getVibrator()Landroid/os/Vibrator;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    int-to-long v0, p1

    const/4 p1, -0x1

    invoke-static {v0, v1, p1}, Ls2/c;->a(JI)Landroid/os/VibrationEffect;

    move-result-object p1

    invoke-static {p2, p1}, Ls2/b;->a(Landroid/os/Vibrator;Landroid/os/VibrationEffect;)V

    goto :goto_0

    :cond_1
    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Landroid/os/Vibrator;->vibrate(J)V

    :goto_0
    return-void
.end method

.method public vibrateByPattern(Lcom/facebook/react/bridge/ReadableArray;D)V
    .locals 5

    const-string v0, "pattern"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    double-to-int p2, p2

    invoke-direct {p0}, Lcom/facebook/react/modules/vibration/VibrationModule;->getVibrator()Landroid/os/Vibrator;

    move-result-object p3

    if-nez p3, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v0

    new-array v0, v0, [J

    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getInt(I)I

    move-result v3

    int-to-long v3, v3

    aput-wide v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt p1, v1, :cond_2

    invoke-static {v0, p2}, Ls2/a;->a([JI)Landroid/os/VibrationEffect;

    move-result-object p1

    invoke-static {p3, p1}, Ls2/b;->a(Landroid/os/Vibrator;Landroid/os/VibrationEffect;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p3, v0, p2}, Landroid/os/Vibrator;->vibrate([JI)V

    :goto_1
    return-void
.end method
