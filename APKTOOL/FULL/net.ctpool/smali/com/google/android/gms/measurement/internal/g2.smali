.class public final Lcom/google/android/gms/measurement/internal/g2;
.super Lcom/google/android/gms/measurement/internal/y2;
.source "SourceFile"


# instance fields
.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:I

.field private f:Ljava/lang/String;

.field private g:J

.field private h:J

.field private i:Ljava/util/List;

.field private j:Ljava/lang/String;

.field private k:I

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:J

.field private p:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/S2;J)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/y2;-><init>(Lcom/google/android/gms/measurement/internal/S2;)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/g2;->o:J

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/g2;->p:Ljava/lang/String;

    iput-wide p2, p0, Lcom/google/android/gms/measurement/internal/g2;->h:J

    return-void
.end method

.method private final H()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/D7;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->b()Lcom/google/android/gms/measurement/internal/g;

    move-result-object v0

    sget-object v2, Lcom/google/android/gms/measurement/internal/G;->s0:Lcom/google/android/gms/measurement/internal/b2;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/g;->r(Lcom/google/android/gms/measurement/internal/b2;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->d()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/n2;->I()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v0

    const-string v2, "Disabled IID for tests."

    :goto_0
    invoke-virtual {v0, v2}, Lcom/google/android/gms/measurement/internal/p2;->a(Ljava/lang/String;)V

    return-object v1

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v2, "com.google.firebase.analytics.FirebaseAnalytics"

    invoke-virtual {v0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    :try_start_1
    const-string v2, "getInstance"

    const-class v3, Landroid/content/Context;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->a()Landroid/content/Context;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-nez v2, :cond_2

    return-object v1

    :cond_2
    :try_start_2
    const-string v3, "getFirebaseInstanceId"

    invoke-virtual {v0, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :catch_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->d()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/n2;->K()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v0

    const-string v2, "Failed to retrieve Firebase Instance Id"

    goto :goto_0

    :catch_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->d()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/n2;->L()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v0

    const-string v2, "Failed to obtain Firebase Analytics instance"

    goto :goto_0

    :catch_2
    return-object v1
.end method


# virtual methods
.method final A()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/y2;->t()V

    iget v0, p0, Lcom/google/android/gms/measurement/internal/g2;->k:I

    return v0
.end method

.method final B()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/y2;->t()V

    iget v0, p0, Lcom/google/android/gms/measurement/internal/g2;->e:I

    return v0
.end method

.method final C()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/y2;->t()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/g2;->m:Ljava/lang/String;

    return-object v0
.end method

.method final D()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/y2;->t()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/g2;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/g2;->c:Ljava/lang/String;

    return-object v0
.end method

.method final E()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->l()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/y2;->t()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/g2;->l:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/g2;->l:Ljava/lang/String;

    return-object v0
.end method

.method final F()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/g2;->i:Ljava/util/List;

    return-object v0
.end method

.method final G()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->l()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->g()Lcom/google/android/gms/measurement/internal/z2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/z2;->K()Lcom/google/android/gms/measurement/internal/A3;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/measurement/internal/A3$a;->o:Lcom/google/android/gms/measurement/internal/A3$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/A3;->m(Lcom/google/android/gms/measurement/internal/A3$a;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->d()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/n2;->D()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v0

    const-string v1, "Analytics Storage consent is not granted"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/p2;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    new-array v0, v0, [B

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->h()Lcom/google/android/gms/measurement/internal/d6;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/d6;->U0()Ljava/security/SecureRandom;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-instance v2, Ljava/math/BigInteger;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v0}, Ljava/math/BigInteger;-><init>(I[B)V

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "%032x"

    invoke-static {v1, v2, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->d()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/n2;->D()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v1

    if-nez v0, :cond_1

    const-string v2, "null"

    goto :goto_1

    :cond_1
    const-string v2, "not null"

    :goto_1
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Resetting session stitching token to %s"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/measurement/internal/p2;->a(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/g2;->n:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->zzb()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/g2;->o:J

    return-void
.end method

.method final I(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/g2;->p:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/g2;->p:Ljava/lang/String;

    return v0
.end method

.method public final bridge synthetic a()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/w3;->a()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic b()Lcom/google/android/gms/measurement/internal/g;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/w3;->b()Lcom/google/android/gms/measurement/internal/g;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic c()Lcom/google/android/gms/measurement/internal/x;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/w3;->c()Lcom/google/android/gms/measurement/internal/x;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic d()Lcom/google/android/gms/measurement/internal/n2;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/w3;->d()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic e()Lcom/google/android/gms/measurement/internal/h2;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/w3;->e()Lcom/google/android/gms/measurement/internal/h2;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic f()Lcom/google/android/gms/measurement/internal/P2;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/w3;->f()Lcom/google/android/gms/measurement/internal/P2;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic g()Lcom/google/android/gms/measurement/internal/z2;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/w3;->g()Lcom/google/android/gms/measurement/internal/z2;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic h()Lcom/google/android/gms/measurement/internal/d6;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/w3;->h()Lcom/google/android/gms/measurement/internal/d6;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic j()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a1;->j()V

    return-void
.end method

.method public final bridge synthetic k()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a1;->k()V

    return-void
.end method

.method public final bridge synthetic l()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a1;->l()V

    return-void
.end method

.method public final bridge synthetic m()Lcom/google/android/gms/measurement/internal/y;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a1;->m()Lcom/google/android/gms/measurement/internal/y;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic n()Lcom/google/android/gms/measurement/internal/g2;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a1;->n()Lcom/google/android/gms/measurement/internal/g2;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic o()Lcom/google/android/gms/measurement/internal/f2;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a1;->o()Lcom/google/android/gms/measurement/internal/f2;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic p()Lcom/google/android/gms/measurement/internal/F3;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a1;->p()Lcom/google/android/gms/measurement/internal/F3;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic q()Lcom/google/android/gms/measurement/internal/w4;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a1;->q()Lcom/google/android/gms/measurement/internal/w4;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic r()Lcom/google/android/gms/measurement/internal/F4;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a1;->r()Lcom/google/android/gms/measurement/internal/F4;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic s()Lcom/google/android/gms/measurement/internal/p5;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/a1;->s()Lcom/google/android/gms/measurement/internal/p5;

    move-result-object v0

    return-object v0
.end method

.method protected final w()V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, ""

    const-string v4, "unknown"

    const-string v5, "Unknown"

    const/high16 v6, -0x80000000

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->d()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/n2;->E()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v7

    const-string v8, "PackageManager is null, app identity information might be inaccurate. appId"

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/n2;->t(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Lcom/google/android/gms/measurement/internal/p2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_4

    :cond_0
    :try_start_0
    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->d()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/n2;->E()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v7

    const-string v8, "Error retrieving app installer package name. appId"

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/n2;->t(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Lcom/google/android/gms/measurement/internal/p2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    if-nez v4, :cond_1

    const-string v4, "manual_install"

    goto :goto_1

    :cond_1
    const-string v7, "com.android.vending"

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move-object v4, v3

    :cond_2
    :goto_1
    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->a()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v7

    if-eqz v7, :cond_4

    iget-object v8, v7, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v1, v8}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_3

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_2

    :cond_3
    move-object v8, v5

    :goto_2
    :try_start_2
    iget-object v5, v7, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iget v6, v7, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4

    :catch_1
    move-object v7, v5

    move-object v5, v8

    goto :goto_3

    :catch_2
    move-object v7, v5

    :goto_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->d()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/n2;->E()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v8

    const-string v9, "Error retrieving package info. appId, appName"

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/n2;->t(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v8, v9, v10, v5}, Lcom/google/android/gms/measurement/internal/p2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v5, v7

    :cond_4
    :goto_4
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/g2;->c:Ljava/lang/String;

    iput-object v4, p0, Lcom/google/android/gms/measurement/internal/g2;->f:Ljava/lang/String;

    iput-object v5, p0, Lcom/google/android/gms/measurement/internal/g2;->d:Ljava/lang/String;

    iput v6, p0, Lcom/google/android/gms/measurement/internal/g2;->e:I

    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lcom/google/android/gms/measurement/internal/g2;->g:J

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/S2;->K()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    const/4 v5, 0x1

    if-nez v4, :cond_5

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/S2;->L()Ljava/lang/String;

    move-result-object v4

    const-string v6, "am"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    move v4, v5

    goto :goto_5

    :cond_5
    move v4, v2

    :goto_5
    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/S2;->v()I

    move-result v6

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->d()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object v7

    packed-switch v6, :pswitch_data_0

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/n2;->H()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v7

    const-string v8, "App measurement disabled"

    invoke-virtual {v7, v8}, Lcom/google/android/gms/measurement/internal/p2;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->d()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/n2;->G()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v7

    const-string v8, "Invalid scion state in identity"

    :goto_6
    invoke-virtual {v7, v8}, Lcom/google/android/gms/measurement/internal/p2;->a(Ljava/lang/String;)V

    goto :goto_7

    :pswitch_0
    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/n2;->H()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v7

    const-string v8, "App measurement disabled due to denied storage consent"

    goto :goto_6

    :pswitch_1
    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/n2;->H()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v7

    const-string v8, "App measurement disabled via the global data collection setting"

    goto :goto_6

    :pswitch_2
    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/n2;->K()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v7

    const-string v8, "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"

    goto :goto_6

    :pswitch_3
    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/n2;->I()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v7

    const-string v8, "App measurement disabled via the init parameters"

    goto :goto_6

    :pswitch_4
    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/n2;->H()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v7

    const-string v8, "App measurement disabled via the manifest"

    goto :goto_6

    :pswitch_5
    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/n2;->H()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v7

    const-string v8, "App measurement disabled by setAnalyticsCollectionEnabled(false)"

    goto :goto_6

    :pswitch_6
    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/n2;->I()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v7

    const-string v8, "App measurement deactivated via the init parameters"

    goto :goto_6

    :pswitch_7
    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/n2;->H()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v7

    const-string v8, "App measurement deactivated via the manifest"

    goto :goto_6

    :pswitch_8
    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/n2;->I()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v7

    const-string v8, "App measurement collection enabled"

    goto :goto_6

    :goto_7
    if-nez v6, :cond_6

    goto :goto_8

    :cond_6
    move v5, v2

    :goto_8
    iput-object v3, p0, Lcom/google/android/gms/measurement/internal/g2;->l:Ljava/lang/String;

    iput-object v3, p0, Lcom/google/android/gms/measurement/internal/g2;->m:Ljava/lang/String;

    if-eqz v4, :cond_7

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/S2;->K()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/gms/measurement/internal/g2;->m:Ljava/lang/String;

    :cond_7
    :try_start_3
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->a()Landroid/content/Context;

    move-result-object v4

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/S2;->N()Ljava/lang/String;

    move-result-object v6

    const-string v7, "google_app_id"

    new-instance v8, Lw3/p;

    invoke-direct {v8, v4, v6}, Lw3/p;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Lw3/p;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_9

    :cond_8
    move-object v3, v4

    :goto_9
    iput-object v3, p0, Lcom/google/android/gms/measurement/internal/g2;->l:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_9

    new-instance v3, Lw3/p;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->a()Landroid/content/Context;

    move-result-object v4

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/S2;->N()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v4, v6}, Lw3/p;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const-string v4, "admob_app_id"

    invoke-virtual {v3, v4}, Lw3/p;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/gms/measurement/internal/g2;->m:Ljava/lang/String;

    goto :goto_a

    :catch_3
    move-exception v3

    goto :goto_c

    :cond_9
    :goto_a
    if-eqz v5, :cond_b

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->d()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/n2;->I()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v3

    const-string v4, "App measurement enabled for app package, google app id"

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/g2;->c:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/g2;->l:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_a

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/g2;->m:Ljava/lang/String;

    goto :goto_b

    :cond_a
    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/g2;->l:Ljava/lang/String;

    :goto_b
    invoke-virtual {v3, v4, v5, v6}, Lcom/google/android/gms/measurement/internal/p2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_d

    :goto_c
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->d()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/n2;->E()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v4

    const-string v5, "Fetching Google App Id failed with exception. appId"

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/n2;->t(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v5, v0, v3}, Lcom/google/android/gms/measurement/internal/p2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_b
    :goto_d
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/g2;->i:Ljava/util/List;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->b()Lcom/google/android/gms/measurement/internal/g;

    move-result-object v0

    const-string v3, "analytics.safelisted_events"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/measurement/internal/g;->H(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->d()Lcom/google/android/gms/measurement/internal/n2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/n2;->K()Lcom/google/android/gms/measurement/internal/p2;

    move-result-object v0

    const-string v3, "Safelisted event list is empty. Ignoring"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/measurement/internal/p2;->a(Ljava/lang/String;)V

    goto :goto_e

    :cond_c
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->h()Lcom/google/android/gms/measurement/internal/d6;

    move-result-object v5

    const-string v6, "safelisted event"

    invoke-virtual {v5, v6, v4}, Lcom/google/android/gms/measurement/internal/d6;->u0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_d

    goto :goto_e

    :cond_e
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/g2;->i:Ljava/util/List;

    :goto_e
    if-eqz v1, :cond_f

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/w3;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/wrappers/InstantApps;->isInstantApp(Landroid/content/Context;)Z

    move-result v0

    iput v0, p0, Lcom/google/android/gms/measurement/internal/g2;->k:I

    return-void

    :cond_f
    iput v2, p0, Lcom/google/android/gms/measurement/internal/g2;->k:I

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected final y()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method final z(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/M5;
    .locals 48

    .line 1
    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->l()V

    new-instance v42, Lcom/google/android/gms/measurement/internal/M5;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/g2;->D()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/g2;->E()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/y2;->t()V

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/g2;->d:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/g2;->B()I

    move-result v1

    int-to-long v5, v1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/y2;->t()V

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/g2;->f:Ljava/lang/String;

    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v7, v0, Lcom/google/android/gms/measurement/internal/g2;->f:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/y2;->t()V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->l()V

    iget-wide v8, v0, Lcom/google/android/gms/measurement/internal/g2;->g:J

    const-wide/16 v10, 0x0

    cmp-long v1, v8, v10

    if-nez v1, :cond_0

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/S2;->J()Lcom/google/android/gms/measurement/internal/d6;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->a()Landroid/content/Context;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->a()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v8, v9}, Lcom/google/android/gms/measurement/internal/d6;->x(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v8

    iput-wide v8, v0, Lcom/google/android/gms/measurement/internal/g2;->g:J

    :cond_0
    iget-wide v12, v0, Lcom/google/android/gms/measurement/internal/g2;->g:J

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/S2;->n()Z

    move-result v14

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->g()Lcom/google/android/gms/measurement/internal/z2;

    move-result-object v1

    iget-boolean v1, v1, Lcom/google/android/gms/measurement/internal/z2;->t:Z

    const/4 v8, 0x1

    xor-int/lit8 v15, v1, 0x1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->l()V

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/S2;->n()Z

    move-result v1

    if-nez v1, :cond_1

    const/16 v18, 0x0

    goto :goto_0

    :cond_1
    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/g2;->H()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v18, v1

    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/w3;->a:Lcom/google/android/gms/measurement/internal/S2;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/S2;->D()Lcom/google/android/gms/measurement/internal/z2;

    move-result-object v9

    iget-object v9, v9, Lcom/google/android/gms/measurement/internal/z2;->g:Lcom/google/android/gms/measurement/internal/A2;

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/A2;->a()J

    move-result-wide v8

    cmp-long v19, v8, v10

    if-nez v19, :cond_2

    iget-wide v8, v1, Lcom/google/android/gms/measurement/internal/S2;->H:J

    :goto_1
    move-wide/from16 v21, v8

    goto :goto_2

    :cond_2
    iget-wide v10, v1, Lcom/google/android/gms/measurement/internal/S2;->H:J

    invoke-static {v10, v11, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    goto :goto_1

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/g2;->A()I

    move-result v23

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->b()Lcom/google/android/gms/measurement/internal/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/g;->S()Z

    move-result v24

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->g()Lcom/google/android/gms/measurement/internal/z2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/w3;->l()V

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/z2;->H()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v8, "deferred_analytics_collection"

    const/4 v9, 0x0

    invoke-interface {v1, v8, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v25

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/g2;->C()Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->b()Lcom/google/android/gms/measurement/internal/g;

    move-result-object v1

    const-string v8, "google_analytics_default_allow_ad_personalization_signals"

    invoke-virtual {v1, v8}, Lcom/google/android/gms/measurement/internal/g;->C(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_3

    const/16 v27, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v10, 0x1

    xor-int/2addr v1, v10

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    move-object/from16 v27, v1

    :goto_3
    iget-wide v10, v0, Lcom/google/android/gms/measurement/internal/g2;->h:J

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/g2;->i:Ljava/util/List;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->g()Lcom/google/android/gms/measurement/internal/z2;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Lcom/google/android/gms/measurement/internal/z2;->K()Lcom/google/android/gms/measurement/internal/A3;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Lcom/google/android/gms/measurement/internal/A3;->x()Ljava/lang/String;

    move-result-object v29

    iget-object v9, v0, Lcom/google/android/gms/measurement/internal/g2;->j:Ljava/lang/String;

    if-nez v9, :cond_4

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->h()Lcom/google/android/gms/measurement/internal/d6;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/measurement/internal/d6;->S0()Ljava/lang/String;

    move-result-object v9

    iput-object v9, v0, Lcom/google/android/gms/measurement/internal/g2;->j:Ljava/lang/String;

    :cond_4
    iget-object v9, v0, Lcom/google/android/gms/measurement/internal/g2;->j:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/o6;->a()Z

    move-result v30

    if-eqz v30, :cond_5

    move-object/from16 v30, v1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->b()Lcom/google/android/gms/measurement/internal/g;

    move-result-object v1

    move-object/from16 v31, v9

    sget-object v9, Lcom/google/android/gms/measurement/internal/G;->Y0:Lcom/google/android/gms/measurement/internal/b2;

    invoke-virtual {v1, v9}, Lcom/google/android/gms/measurement/internal/g;->r(Lcom/google/android/gms/measurement/internal/b2;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->g()Lcom/google/android/gms/measurement/internal/z2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/z2;->K()Lcom/google/android/gms/measurement/internal/A3;

    move-result-object v1

    sget-object v9, Lcom/google/android/gms/measurement/internal/A3$a;->o:Lcom/google/android/gms/measurement/internal/A3$a;

    invoke-virtual {v1, v9}, Lcom/google/android/gms/measurement/internal/A3;->m(Lcom/google/android/gms/measurement/internal/A3$a;)Z

    move-result v1

    if-nez v1, :cond_6

    move-wide/from16 v32, v10

    move/from16 v34, v14

    move/from16 v35, v15

    const-wide/16 v19, 0x0

    const/16 v36, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v30, v1

    move-object/from16 v31, v9

    :cond_6
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->l()V

    move-wide/from16 v32, v10

    iget-wide v9, v0, Lcom/google/android/gms/measurement/internal/g2;->o:J

    const-wide/16 v19, 0x0

    cmp-long v1, v9, v19

    if-eqz v1, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->zzb()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v9

    move/from16 v34, v14

    move/from16 v35, v15

    iget-wide v14, v0, Lcom/google/android/gms/measurement/internal/g2;->o:J

    sub-long/2addr v9, v14

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/g2;->n:Ljava/lang/String;

    if-eqz v1, :cond_8

    const-wide/32 v14, 0x5265c00

    cmp-long v1, v9, v14

    if-lez v1, :cond_8

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/g2;->p:Ljava/lang/String;

    if-nez v1, :cond_8

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/g2;->G()V

    goto :goto_4

    :cond_7
    move/from16 v34, v14

    move/from16 v35, v15

    :cond_8
    :goto_4
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/g2;->n:Ljava/lang/String;

    if-nez v1, :cond_9

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/g2;->G()V

    :cond_9
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/g2;->n:Ljava/lang/String;

    move-object/from16 v36, v1

    :goto_5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->b()Lcom/google/android/gms/measurement/internal/g;

    move-result-object v1

    const-string v9, "google_analytics_sgtm_upload_enabled"

    invoke-virtual {v1, v9}, Lcom/google/android/gms/measurement/internal/g;->C(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_a

    const/16 v37, 0x0

    goto :goto_6

    :cond_a
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    move/from16 v37, v1

    :goto_6
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->h()Lcom/google/android/gms/measurement/internal/d6;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/g2;->D()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Lcom/google/android/gms/measurement/internal/d6;->x0(Ljava/lang/String;)J

    move-result-wide v38

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->g()Lcom/google/android/gms/measurement/internal/z2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/z2;->K()Lcom/google/android/gms/measurement/internal/A3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/A3;->b()I

    move-result v43

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->g()Lcom/google/android/gms/measurement/internal/z2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/z2;->J()Lcom/google/android/gms/measurement/internal/v;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/v;->j()Ljava/lang/String;

    move-result-object v44

    invoke-static {}, Lcom/google/android/gms/internal/measurement/r7;->a()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->b()Lcom/google/android/gms/measurement/internal/g;

    move-result-object v1

    sget-object v9, Lcom/google/android/gms/measurement/internal/G;->J0:Lcom/google/android/gms/measurement/internal/b2;

    invoke-virtual {v1, v9}, Lcom/google/android/gms/measurement/internal/g;->r(Lcom/google/android/gms/measurement/internal/b2;)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->h()Lcom/google/android/gms/measurement/internal/d6;

    invoke-static {}, Lcom/google/android/gms/measurement/internal/d6;->w0()I

    move-result v1

    move/from16 v45, v1

    goto :goto_7

    :cond_b
    const/16 v45, 0x0

    :goto_7
    invoke-static {}, Lcom/google/android/gms/internal/measurement/r7;->a()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->b()Lcom/google/android/gms/measurement/internal/g;

    move-result-object v1

    sget-object v9, Lcom/google/android/gms/measurement/internal/G;->J0:Lcom/google/android/gms/measurement/internal/b2;

    invoke-virtual {v1, v9}, Lcom/google/android/gms/measurement/internal/g;->r(Lcom/google/android/gms/measurement/internal/b2;)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->h()Lcom/google/android/gms/measurement/internal/d6;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/d6;->O0()J

    move-result-wide v9

    move-wide/from16 v46, v9

    goto :goto_8

    :cond_c
    move-wide/from16 v46, v19

    :goto_8
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->b()Lcom/google/android/gms/measurement/internal/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/g;->R()Ljava/lang/String;

    move-result-object v40

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/w3;->b()Lcom/google/android/gms/measurement/internal/g;

    move-result-object v1

    const/4 v9, 0x1

    invoke-virtual {v1, v8, v9}, Lcom/google/android/gms/measurement/internal/g;->z(Ljava/lang/String;Z)Lw3/r;

    move-result-object v1

    new-instance v8, Lcom/google/android/gms/measurement/internal/B1;

    invoke-direct {v8, v1}, Lcom/google/android/gms/measurement/internal/B1;-><init>(Lw3/r;)V

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/B1;->c()Ljava/lang/String;

    move-result-object v41

    const-wide/32 v8, 0x19e10

    const-wide/16 v16, 0x0

    const/16 v28, 0x0

    move-object/from16 v1, v42

    move-wide v10, v12

    move-object/from16 v12, p1

    move/from16 v13, v34

    move/from16 v14, v35

    move-object/from16 v15, v18

    move-wide/from16 v18, v21

    move/from16 v20, v23

    move/from16 v21, v24

    move/from16 v22, v25

    move-object/from16 v23, v26

    move-object/from16 v24, v27

    move-wide/from16 v25, v32

    move-object/from16 v27, v30

    move-object/from16 v30, v31

    move-object/from16 v31, v36

    move/from16 v32, v37

    move-wide/from16 v33, v38

    move/from16 v35, v43

    move-object/from16 v36, v44

    move/from16 v37, v45

    move-wide/from16 v38, v46

    invoke-direct/range {v1 .. v41}, Lcom/google/android/gms/measurement/internal/M5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;)V

    return-object v42
.end method

.method public final bridge synthetic zzb()Lcom/google/android/gms/common/util/Clock;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/w3;->zzb()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzd()Lcom/google/android/gms/measurement/internal/c;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/measurement/internal/w3;->zzd()Lcom/google/android/gms/measurement/internal/c;

    move-result-object v0

    return-object v0
.end method
