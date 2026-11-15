.class public abstract Lcom/tenjin/android/store/QueueEventDatabase;
.super Landroidx/room/u;
.source "SourceFile"


# static fields
.field private static volatile INSTANCE:Lcom/tenjin/android/store/QueueEventDatabase;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/room/u;-><init>()V

    return-void
.end method

.method public static getDatabase(Landroid/content/Context;)Lcom/tenjin/android/store/QueueEventDatabase;
    .locals 3

    sget-object v0, Lcom/tenjin/android/store/QueueEventDatabase;->INSTANCE:Lcom/tenjin/android/store/QueueEventDatabase;

    if-nez v0, :cond_1

    const-class v0, Lcom/tenjin/android/store/QueueEventDatabase;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/tenjin/android/store/QueueEventDatabase;->INSTANCE:Lcom/tenjin/android/store/QueueEventDatabase;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-class v1, Lcom/tenjin/android/store/QueueEventDatabase;

    const-string v2, "queue_event_database"

    invoke-static {p0, v1, v2}, Landroidx/room/t;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/u$a;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/room/u$a;->d()Landroidx/room/u;

    move-result-object p0

    check-cast p0, Lcom/tenjin/android/store/QueueEventDatabase;

    sput-object p0, Lcom/tenjin/android/store/QueueEventDatabase;->INSTANCE:Lcom/tenjin/android/store/QueueEventDatabase;

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
    sget-object p0, Lcom/tenjin/android/store/QueueEventDatabase;->INSTANCE:Lcom/tenjin/android/store/QueueEventDatabase;

    return-object p0
.end method


# virtual methods
.method public abstract queueEventDao()Lcom/tenjin/android/store/QueueEventDao;
.end method
