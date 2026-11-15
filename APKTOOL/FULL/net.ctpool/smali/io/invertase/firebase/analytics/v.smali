.class public Lio/invertase/firebase/analytics/v;
.super Lio/invertase/firebase/common/b;
.source "SourceFile"


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/invertase/firebase/common/b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(Lio/invertase/firebase/analytics/v;Landroid/os/Bundle;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/invertase/firebase/analytics/v;->q(Landroid/os/Bundle;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lio/invertase/firebase/analytics/v;Landroid/os/Bundle;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/invertase/firebase/analytics/v;->r(Landroid/os/Bundle;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lio/invertase/firebase/analytics/v;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lio/invertase/firebase/analytics/v;->v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lio/invertase/firebase/analytics/v;Ljava/lang/Boolean;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/invertase/firebase/analytics/v;->p(Ljava/lang/Boolean;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lio/invertase/firebase/analytics/v;J)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lio/invertase/firebase/analytics/v;->s(J)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lio/invertase/firebase/analytics/v;Ljava/lang/String;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/invertase/firebase/analytics/v;->t(Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lio/invertase/firebase/analytics/v;Landroid/os/Bundle;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/invertase/firebase/analytics/v;->u(Landroid/os/Bundle;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lio/invertase/firebase/analytics/v;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/invertase/firebase/analytics/v;->o()Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lio/invertase/firebase/analytics/v;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lio/invertase/firebase/analytics/v;->n(Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method private synthetic n(Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/analytics/FirebaseAnalytics;->c(Ljava/lang/String;Landroid/os/Bundle;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic o()Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->d()V

    const/4 v0, 0x0

    return-object v0
.end method

.method private synthetic p(Ljava/lang/Boolean;)Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->e(Z)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic q(Landroid/os/Bundle;)Ljava/lang/Void;
    .locals 5

    .line 1
    const-string v0, "analytics_storage"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "ad_storage"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "ad_user_data"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    const-string v3, "ad_personalization"

    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    new-instance v3, Ljava/util/EnumMap;

    const-class v4, Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    invoke-direct {v3, v4}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sget-object v4, Lcom/google/firebase/analytics/FirebaseAnalytics$b;->n:Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/firebase/analytics/FirebaseAnalytics$a;->m:Lcom/google/firebase/analytics/FirebaseAnalytics$a;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/firebase/analytics/FirebaseAnalytics$a;->n:Lcom/google/firebase/analytics/FirebaseAnalytics$a;

    :goto_0
    invoke-interface {v3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/firebase/analytics/FirebaseAnalytics$b;->m:Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    if-eqz v1, :cond_1

    sget-object v1, Lcom/google/firebase/analytics/FirebaseAnalytics$a;->m:Lcom/google/firebase/analytics/FirebaseAnalytics$a;

    goto :goto_1

    :cond_1
    sget-object v1, Lcom/google/firebase/analytics/FirebaseAnalytics$a;->n:Lcom/google/firebase/analytics/FirebaseAnalytics$a;

    :goto_1
    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/firebase/analytics/FirebaseAnalytics$b;->o:Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    if-eqz v2, :cond_2

    sget-object v1, Lcom/google/firebase/analytics/FirebaseAnalytics$a;->m:Lcom/google/firebase/analytics/FirebaseAnalytics$a;

    goto :goto_2

    :cond_2
    sget-object v1, Lcom/google/firebase/analytics/FirebaseAnalytics$a;->n:Lcom/google/firebase/analytics/FirebaseAnalytics$a;

    :goto_2
    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/firebase/analytics/FirebaseAnalytics$b;->p:Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    if-eqz p1, :cond_3

    sget-object p1, Lcom/google/firebase/analytics/FirebaseAnalytics$a;->m:Lcom/google/firebase/analytics/FirebaseAnalytics$a;

    goto :goto_3

    :cond_3
    sget-object p1, Lcom/google/firebase/analytics/FirebaseAnalytics$a;->n:Lcom/google/firebase/analytics/FirebaseAnalytics$a;

    :goto_3
    invoke-interface {v3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/google/firebase/analytics/FirebaseAnalytics;->f(Ljava/util/Map;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic r(Landroid/os/Bundle;)Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->g(Landroid/os/Bundle;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic s(J)Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/analytics/FirebaseAnalytics;->h(J)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic t(Ljava/lang/String;)Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->i(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic u(Landroid/os/Bundle;)Ljava/lang/Void;
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/google/firebase/analytics/FirebaseAnalytics;->j(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/analytics/FirebaseAnalytics;->j(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method A(Landroid/os/Bundle;)Lz3/l;
    .locals 1

    .line 1
    new-instance v0, Lio/invertase/firebase/analytics/t;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lio/invertase/firebase/analytics/t;-><init>(Lio/invertase/firebase/analytics/v;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lz3/o;->c(Ljava/util/concurrent/Callable;)Lz3/l;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method B(J)Lz3/l;
    .locals 1

    .line 1
    new-instance v0, Lio/invertase/firebase/analytics/u;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lio/invertase/firebase/analytics/u;-><init>(Lio/invertase/firebase/analytics/v;J)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lz3/o;->c(Ljava/util/concurrent/Callable;)Lz3/l;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method C(Ljava/lang/String;)Lz3/l;
    .locals 1

    .line 1
    new-instance v0, Lio/invertase/firebase/analytics/q;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lio/invertase/firebase/analytics/q;-><init>(Lio/invertase/firebase/analytics/v;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lz3/o;->c(Ljava/util/concurrent/Callable;)Lz3/l;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method D(Landroid/os/Bundle;)Lz3/l;
    .locals 1

    .line 1
    new-instance v0, Lio/invertase/firebase/analytics/m;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lio/invertase/firebase/analytics/m;-><init>(Lio/invertase/firebase/analytics/v;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lz3/o;->c(Ljava/util/concurrent/Callable;)Lz3/l;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method E(Ljava/lang/String;Ljava/lang/String;)Lz3/l;
    .locals 1

    .line 1
    new-instance v0, Lio/invertase/firebase/analytics/s;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lio/invertase/firebase/analytics/s;-><init>(Lio/invertase/firebase/analytics/v;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lz3/o;->c(Ljava/util/concurrent/Callable;)Lz3/l;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method l()Lz3/l;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->a()Lz3/l;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method m()Lz3/l;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/invertase/firebase/common/b;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/google/firebase/analytics/FirebaseAnalytics;->b()Lz3/l;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method w(Ljava/lang/String;Landroid/os/Bundle;)Lz3/l;
    .locals 1

    .line 1
    new-instance v0, Lio/invertase/firebase/analytics/r;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lio/invertase/firebase/analytics/r;-><init>(Lio/invertase/firebase/analytics/v;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lz3/o;->c(Ljava/util/concurrent/Callable;)Lz3/l;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method x()Lz3/l;
    .locals 1

    .line 1
    new-instance v0, Lio/invertase/firebase/analytics/n;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lio/invertase/firebase/analytics/n;-><init>(Lio/invertase/firebase/analytics/v;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lz3/o;->c(Ljava/util/concurrent/Callable;)Lz3/l;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method y(Ljava/lang/Boolean;)Lz3/l;
    .locals 1

    .line 1
    new-instance v0, Lio/invertase/firebase/analytics/p;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lio/invertase/firebase/analytics/p;-><init>(Lio/invertase/firebase/analytics/v;Ljava/lang/Boolean;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lz3/o;->c(Ljava/util/concurrent/Callable;)Lz3/l;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method z(Landroid/os/Bundle;)Lz3/l;
    .locals 1

    .line 1
    new-instance v0, Lio/invertase/firebase/analytics/o;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lio/invertase/firebase/analytics/o;-><init>(Lio/invertase/firebase/analytics/v;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lz3/o;->c(Ljava/util/concurrent/Callable;)Lz3/l;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method
