.class public abstract Lapp/notifee/core/database/NotifeeCoreDatabase;
.super Landroidx/room/u;
.source "SourceFile"


# static fields
.field public static volatile a:Lapp/notifee/core/database/NotifeeCoreDatabase;

.field public static final b:Ljava/util/concurrent/ExecutorService;

.field public static final c:LW/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Lapp/notifee/core/database/NotifeeCoreDatabase$a;

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lapp/notifee/core/database/NotifeeCoreDatabase$a;-><init>(II)V

    sput-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->c:LW/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/room/u;-><init>()V

    return-void
.end method

.method public static e(Landroid/content/Context;)Lapp/notifee/core/database/NotifeeCoreDatabase;
    .locals 3

    .line 1
    sget-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->a:Lapp/notifee/core/database/NotifeeCoreDatabase;

    if-nez v0, :cond_1

    const-class v0, Lapp/notifee/core/database/NotifeeCoreDatabase;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lapp/notifee/core/database/NotifeeCoreDatabase;->a:Lapp/notifee/core/database/NotifeeCoreDatabase;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-class v1, Lapp/notifee/core/database/NotifeeCoreDatabase;

    const-string v2, "notifee_core_database"

    invoke-static {p0, v1, v2}, Landroidx/room/t;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/u$a;

    move-result-object p0

    sget-object v1, Lapp/notifee/core/database/NotifeeCoreDatabase;->c:LW/b;

    filled-new-array {v1}, [LW/b;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroidx/room/u$a;->b([LW/b;)Landroidx/room/u$a;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/room/u$a;->d()Landroidx/room/u;

    move-result-object p0

    check-cast p0, Lapp/notifee/core/database/NotifeeCoreDatabase;

    sput-object p0, Lapp/notifee/core/database/NotifeeCoreDatabase;->a:Lapp/notifee/core/database/NotifeeCoreDatabase;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    sget-object p0, Lapp/notifee/core/database/NotifeeCoreDatabase;->a:Lapp/notifee/core/database/NotifeeCoreDatabase;

    return-object p0
.end method


# virtual methods
.method public abstract d()LS5/p;
.end method
