.class public final Lcom/facebook/react/devsupport/G;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/facebook/react/devsupport/G;

.field private static volatile b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/devsupport/G;

    invoke-direct {v0}, Lcom/facebook/react/devsupport/G;-><init>()V

    sput-object v0, Lcom/facebook/react/devsupport/G;->a:Lcom/facebook/react/devsupport/G;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final declared-synchronized a()V
    .locals 2

    .line 1
    const-class v0, Lcom/facebook/react/devsupport/G;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lcom/facebook/react/devsupport/G;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    const-string v1, "react_devsupportjni"

    invoke-static {v1}, Lcom/facebook/soloader/SoLoader;->t(Ljava/lang/String;)Z

    const/4 v1, 0x1

    sput-boolean v1, Lcom/facebook/react/devsupport/G;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
