.class public Landroidx/work/impl/background/systemjob/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/work/impl/t;


# static fields
.field private static final q:Ljava/lang/String;


# instance fields
.field private final m:Landroid/content/Context;

.field private final n:Landroid/app/job/JobScheduler;

.field private final o:Landroidx/work/impl/E;

.field private final p:Landroidx/work/impl/background/systemjob/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "SystemJobScheduler"

    invoke-static {v0}, Ll0/i;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/impl/background/systemjob/g;->q:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/impl/E;)V
    .locals 2

    .line 1
    const-string v0, "jobscheduler"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobScheduler;

    new-instance v1, Landroidx/work/impl/background/systemjob/f;

    invoke-direct {v1, p1}, Landroidx/work/impl/background/systemjob/f;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/work/impl/background/systemjob/g;-><init>(Landroid/content/Context;Landroidx/work/impl/E;Landroid/app/job/JobScheduler;Landroidx/work/impl/background/systemjob/f;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/impl/E;Landroid/app/job/JobScheduler;Landroidx/work/impl/background/systemjob/f;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/background/systemjob/g;->m:Landroid/content/Context;

    iput-object p2, p0, Landroidx/work/impl/background/systemjob/g;->o:Landroidx/work/impl/E;

    iput-object p3, p0, Landroidx/work/impl/background/systemjob/g;->n:Landroid/app/job/JobScheduler;

    iput-object p4, p0, Landroidx/work/impl/background/systemjob/g;->p:Landroidx/work/impl/background/systemjob/f;

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "jobscheduler"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobScheduler;

    if-eqz v0, :cond_0

    invoke-static {p0, v0}, Landroidx/work/impl/background/systemjob/g;->g(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/job/JobInfo;

    invoke-virtual {v1}, Landroid/app/job/JobInfo;->getId()I

    move-result v1

    invoke-static {v0, v1}, Landroidx/work/impl/background/systemjob/g;->b(Landroid/app/job/JobScheduler;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static b(Landroid/app/job/JobScheduler;I)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/app/job/JobScheduler;->cancel(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {}, Ll0/i;->e()Ll0/i;

    move-result-object v0

    sget-object v1, Landroidx/work/impl/background/systemjob/g;->q:Ljava/lang/String;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v3, "Exception while trying to cancel job (%d)"

    invoke-static {v2, v3, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1, p0}, Ll0/i;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private static f(Landroid/content/Context;Landroid/app/job/JobScheduler;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-static {p0, p1}, Landroidx/work/impl/background/systemjob/g;->g(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/List;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobInfo;

    invoke-static {v0}, Landroidx/work/impl/background/systemjob/g;->h(Landroid/app/job/JobInfo;)Lq0/m;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lq0/m;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/app/job/JobInfo;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method private static g(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/List;
    .locals 4

    .line 1
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Landroid/app/job/JobScheduler;->getAllPendingJobs()Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {}, Ll0/i;->e()Ll0/i;

    move-result-object v1

    sget-object v2, Landroidx/work/impl/background/systemjob/g;->q:Ljava/lang/String;

    const-string v3, "getAllPendingJobs() is not reliable on this device."

    invoke-virtual {v1, v2, v3, p1}, Ll0/i;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p1, v0

    :goto_0
    if-nez p1, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v1, Landroid/content/ComponentName;

    const-class v2, Landroidx/work/impl/background/systemjob/SystemJobService;

    invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/job/JobInfo;

    invoke-virtual {p1}, Landroid/app/job/JobInfo;->getService()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v0
.end method

.method private static h(Landroid/app/job/JobInfo;)Lq0/m;
    .locals 3

    .line 1
    const-string v0, "EXTRA_WORK_SPEC_ID"

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/job/JobInfo;->getExtras()Landroid/os/PersistableBundle;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string v1, "EXTRA_WORK_SPEC_GENERATION"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {p0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    new-instance v2, Lq0/m;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v2, p0, v1}, Lq0/m;-><init>(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :catch_0
    :cond_0
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public static i(Landroid/content/Context;Landroidx/work/impl/E;)Z
    .locals 6

    .line 1
    const-string v0, "jobscheduler"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobScheduler;

    invoke-static {p0, v0}, Landroidx/work/impl/background/systemjob/g;->g(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p1}, Landroidx/work/impl/E;->v()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->g()Lq0/j;

    move-result-object v1

    invoke-interface {v1}, Lq0/j;->a()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v3}, Ljava/util/HashSet;-><init>(I)V

    if-eqz p0, :cond_2

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/job/JobInfo;

    invoke-static {v3}, Landroidx/work/impl/background/systemjob/g;->h(Landroid/app/job/JobInfo;)Lq0/m;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lq0/m;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Landroid/app/job/JobInfo;->getId()I

    move-result v3

    invoke-static {v0, v3}, Landroidx/work/impl/background/systemjob/g;->b(Landroid/app/job/JobScheduler;I)V

    goto :goto_1

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v4, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, Ll0/i;->e()Ll0/i;

    move-result-object p0

    sget-object v0, Landroidx/work/impl/background/systemjob/g;->q:Ljava/lang/String;

    const-string v2, "Reconciling jobs"

    invoke-virtual {p0, v0, v2}, Ll0/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    :cond_4
    if-eqz v2, :cond_6

    invoke-virtual {p1}, Landroidx/work/impl/E;->v()Landroidx/work/impl/WorkDatabase;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/room/u;->beginTransaction()V

    :try_start_0
    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->j()Lq0/v;

    move-result-object p1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-wide/16 v3, -0x1

    invoke-interface {p1, v1, v3, v4}, Lq0/v;->e(Ljava/lang/String;J)I

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Landroidx/room/u;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Landroidx/room/u;->endTransaction()V

    goto :goto_4

    :goto_3
    invoke-virtual {p0}, Landroidx/room/u;->endTransaction()V

    throw p1

    :cond_6
    :goto_4
    return v2
.end method


# virtual methods
.method public c()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/work/impl/background/systemjob/g;->m:Landroid/content/Context;

    iget-object v1, p0, Landroidx/work/impl/background/systemjob/g;->n:Landroid/app/job/JobScheduler;

    invoke-static {v0, v1, p1}, Landroidx/work/impl/background/systemjob/g;->f(Landroid/content/Context;Landroid/app/job/JobScheduler;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Landroidx/work/impl/background/systemjob/g;->n:Landroid/app/job/JobScheduler;

    invoke-static {v2, v1}, Landroidx/work/impl/background/systemjob/g;->b(Landroid/app/job/JobScheduler;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/work/impl/background/systemjob/g;->o:Landroidx/work/impl/E;

    invoke-virtual {v0}, Landroidx/work/impl/E;->v()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->g()Lq0/j;

    move-result-object v0

    invoke-interface {v0, p1}, Lq0/j;->f(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public varargs e([Lq0/u;)V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/work/impl/background/systemjob/g;->o:Landroidx/work/impl/E;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/work/impl/E;->v()Landroidx/work/impl/WorkDatabase;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lr0/k;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lr0/k;-><init>(Landroidx/work/impl/WorkDatabase;)V

    .line 10
    .line 11
    .line 12
    array-length v2, p1

    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_0
    if-ge v3, v2, :cond_4

    .line 15
    .line 16
    aget-object v4, p1, v3

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/room/u;->beginTransaction()V

    .line 19
    .line 20
    .line 21
    :try_start_0
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->j()Lq0/v;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget-object v6, v4, Lq0/u;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-interface {v5, v6}, Lq0/v;->q(Ljava/lang/String;)Lq0/u;

    .line 28
    .line 29
    .line 30
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    const-string v6, "Skipping scheduling "

    .line 32
    .line 33
    if-nez v5, :cond_0

    .line 34
    .line 35
    :try_start_1
    invoke-static {}, Ll0/i;->e()Ll0/i;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    sget-object v7, Landroidx/work/impl/background/systemjob/g;->q:Ljava/lang/String;

    .line 40
    .line 41
    new-instance v8, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v4, v4, Lq0/u;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v4, " because it\'s no longer in the DB"

    .line 55
    .line 56
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v5, v7, v4}, Ll0/i;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :goto_1
    invoke-virtual {v0}, Landroidx/room/u;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroidx/room/u;->endTransaction()V

    .line 70
    .line 71
    .line 72
    goto :goto_3

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    goto :goto_4

    .line 75
    :cond_0
    :try_start_2
    iget-object v5, v5, Lq0/u;->b:Ll0/s;

    .line 76
    .line 77
    sget-object v7, Ll0/s;->m:Ll0/s;

    .line 78
    .line 79
    if-eq v5, v7, :cond_1

    .line 80
    .line 81
    invoke-static {}, Ll0/i;->e()Ll0/i;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    sget-object v7, Landroidx/work/impl/background/systemjob/g;->q:Ljava/lang/String;

    .line 86
    .line 87
    new-instance v8, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget-object v4, v4, Lq0/u;->a:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v4, " because it is no longer enqueued"

    .line 101
    .line 102
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-virtual {v5, v7, v4}, Ll0/i;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_1
    invoke-static {v4}, Lq0/x;->a(Lq0/u;)Lq0/m;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->g()Lq0/j;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-interface {v6, v5}, Lq0/j;->e(Lq0/m;)Lq0/i;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    if-eqz v6, :cond_2

    .line 126
    .line 127
    iget v7, v6, Lq0/i;->c:I

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_2
    iget-object v7, p0, Landroidx/work/impl/background/systemjob/g;->o:Landroidx/work/impl/E;

    .line 131
    .line 132
    invoke-virtual {v7}, Landroidx/work/impl/E;->o()Landroidx/work/a;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    invoke-virtual {v7}, Landroidx/work/a;->i()I

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    iget-object v8, p0, Landroidx/work/impl/background/systemjob/g;->o:Landroidx/work/impl/E;

    .line 141
    .line 142
    invoke-virtual {v8}, Landroidx/work/impl/E;->o()Landroidx/work/a;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    invoke-virtual {v8}, Landroidx/work/a;->g()I

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    invoke-virtual {v1, v7, v8}, Lr0/k;->e(II)I

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    :goto_2
    if-nez v6, :cond_3

    .line 155
    .line 156
    invoke-static {v5, v7}, Lq0/l;->a(Lq0/m;I)Lq0/i;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    iget-object v6, p0, Landroidx/work/impl/background/systemjob/g;->o:Landroidx/work/impl/E;

    .line 161
    .line 162
    invoke-virtual {v6}, Landroidx/work/impl/E;->v()Landroidx/work/impl/WorkDatabase;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->g()Lq0/j;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    invoke-interface {v6, v5}, Lq0/j;->b(Lq0/i;)V

    .line 171
    .line 172
    .line 173
    :cond_3
    invoke-virtual {p0, v4, v7}, Landroidx/work/impl/background/systemjob/g;->j(Lq0/u;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 178
    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :goto_4
    invoke-virtual {v0}, Landroidx/room/u;->endTransaction()V

    .line 182
    .line 183
    .line 184
    throw p1

    .line 185
    :cond_4
    return-void
.end method

.method public j(Lq0/u;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/work/impl/background/systemjob/g;->p:Landroidx/work/impl/background/systemjob/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroidx/work/impl/background/systemjob/f;->a(Lq0/u;I)Landroid/app/job/JobInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Ll0/i;->e()Ll0/i;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Landroidx/work/impl/background/systemjob/g;->q:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v3, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v4, "Scheduling work ID "

    .line 19
    .line 20
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget-object v4, p1, Lq0/u;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v4, "Job ID "

    .line 29
    .line 30
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v1, v2, v3}, Ll0/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    :try_start_0
    iget-object v3, p0, Landroidx/work/impl/background/systemjob/g;->n:Landroid/app/job/JobScheduler;

    .line 45
    .line 46
    invoke-virtual {v3, v0}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    invoke-static {}, Ll0/i;->e()Ll0/i;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-instance v3, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v4, "Unable to schedule work ID "

    .line 62
    .line 63
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v4, p1, Lq0/u;->a:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v0, v2, v3}, Ll0/i;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-boolean v0, p1, Lq0/u;->q:Z

    .line 79
    .line 80
    if-eqz v0, :cond_1

    .line 81
    .line 82
    iget-object v0, p1, Lq0/u;->r:Ll0/m;

    .line 83
    .line 84
    sget-object v3, Ll0/m;->m:Ll0/m;

    .line 85
    .line 86
    if-ne v0, v3, :cond_1

    .line 87
    .line 88
    iput-boolean v1, p1, Lq0/u;->q:Z

    .line 89
    .line 90
    const-string v0, "Scheduling a non-expedited job (work ID %s)"

    .line 91
    .line 92
    iget-object v3, p1, Lq0/u;->a:Ljava/lang/String;

    .line 93
    .line 94
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {}, Ll0/i;->e()Ll0/i;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v3, v2, v0}, Ll0/i;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, p1, p2}, Landroidx/work/impl/background/systemjob/g;->j(Lq0/u;I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    .line 111
    .line 112
    goto/16 :goto_2

    .line 113
    .line 114
    :catchall_0
    move-exception p2

    .line 115
    goto :goto_0

    .line 116
    :catch_0
    move-exception p1

    .line 117
    goto :goto_1

    .line 118
    :goto_0
    invoke-static {}, Ll0/i;->e()Ll0/i;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    sget-object v1, Landroidx/work/impl/background/systemjob/g;->q:Ljava/lang/String;

    .line 123
    .line 124
    new-instance v2, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    const-string v3, "Unable to schedule "

    .line 130
    .line 131
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {v0, v1, p1, p2}, Ll0/i;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :goto_1
    iget-object p2, p0, Landroidx/work/impl/background/systemjob/g;->m:Landroid/content/Context;

    .line 146
    .line 147
    iget-object v0, p0, Landroidx/work/impl/background/systemjob/g;->n:Landroid/app/job/JobScheduler;

    .line 148
    .line 149
    invoke-static {p2, v0}, Landroidx/work/impl/background/systemjob/g;->g(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    if-eqz p2, :cond_0

    .line 154
    .line 155
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    iget-object v1, p0, Landroidx/work/impl/background/systemjob/g;->o:Landroidx/work/impl/E;

    .line 168
    .line 169
    invoke-virtual {v1}, Landroidx/work/impl/E;->v()Landroidx/work/impl/WorkDatabase;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->j()Lq0/v;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-interface {v1}, Lq0/v;->j()Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    iget-object v2, p0, Landroidx/work/impl/background/systemjob/g;->o:Landroidx/work/impl/E;

    .line 190
    .line 191
    invoke-virtual {v2}, Landroidx/work/impl/E;->o()Landroidx/work/a;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {v2}, Landroidx/work/a;->h()I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    const-string v1, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d."

    .line 208
    .line 209
    invoke-static {p2, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    invoke-static {}, Ll0/i;->e()Ll0/i;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    sget-object v1, Landroidx/work/impl/background/systemjob/g;->q:Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {v0, v1, p2}, Ll0/i;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 223
    .line 224
    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 225
    .line 226
    .line 227
    iget-object p1, p0, Landroidx/work/impl/background/systemjob/g;->o:Landroidx/work/impl/E;

    .line 228
    .line 229
    invoke-virtual {p1}, Landroidx/work/impl/E;->o()Landroidx/work/a;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-virtual {p1}, Landroidx/work/a;->l()Landroidx/core/util/a;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    if-eqz p1, :cond_2

    .line 238
    .line 239
    invoke-interface {p1, v0}, Landroidx/core/util/a;->a(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    :cond_1
    :goto_2
    return-void

    .line 243
    :cond_2
    throw v0
.end method
