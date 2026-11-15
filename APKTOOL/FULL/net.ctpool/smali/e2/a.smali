.class public final Le2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le2/a;

.field private static b:Lv5/a;

.field private static c:Le2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le2/a;

    .line 2
    .line 3
    invoke-direct {v0}, Le2/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Le2/a;->a:Le2/a;

    .line 7
    .line 8
    sget-object v0, Le2/a$a;->m:Le2/a$a;

    .line 9
    .line 10
    sput-object v0, Le2/a;->b:Lv5/a;

    .line 11
    .line 12
    invoke-interface {v0}, Lv5/a;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Le2/b;

    .line 17
    .line 18
    sput-object v0, Le2/a;->c:Le2/b;

    .line 19
    .line 20
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final a()Z
    .locals 1

    .line 1
    sget-object v0, Le2/a;->c:Le2/b;

    .line 2
    .line 3
    invoke-interface {v0}, Le2/b;->fixStoppedSurfaceRemoveDeleteTreeUIFrameCallbackLeak()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final b()Z
    .locals 1

    .line 1
    sget-object v0, Le2/a;->c:Le2/b;

    .line 2
    .line 3
    invoke-interface {v0}, Le2/b;->forceBatchingMountItemsOnAndroid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final c()Z
    .locals 1

    .line 1
    sget-object v0, Le2/a;->c:Le2/b;

    .line 2
    .line 3
    invoke-interface {v0}, Le2/b;->lazyAnimationCallbacks()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final d()Z
    .locals 1

    .line 1
    sget-object v0, Le2/a;->c:Le2/b;

    .line 2
    .line 3
    invoke-interface {v0}, Le2/b;->setAndroidLayoutDirection()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final e()Z
    .locals 1

    .line 1
    sget-object v0, Le2/a;->c:Le2/b;

    .line 2
    .line 3
    invoke-interface {v0}, Le2/b;->useImmediateExecutorInAndroidBridgeless()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final f()Z
    .locals 1

    .line 1
    sget-object v0, Le2/a;->c:Le2/b;

    .line 2
    .line 3
    invoke-interface {v0}, Le2/b;->useNativeViewConfigsInBridgelessMode()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
