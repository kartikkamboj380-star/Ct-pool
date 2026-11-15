.class public Lcom/google/firebase/crashlytics/ndk/CrashlyticsNdkRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/crashlytics/ndk/CrashlyticsNdkRegistrar;Lb4/d;)Le4/a;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/firebase/crashlytics/ndk/CrashlyticsNdkRegistrar;->b(Lb4/d;)Le4/a;

    move-result-object p0

    return-object p0
.end method

.method private b(Lb4/d;)Le4/a;
    .locals 1

    .line 1
    const-class v0, Landroid/content/Context;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lb4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {p1}, Le4/f;->g(Landroid/content/Context;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    xor-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    invoke-static {p1, v0}, Lcom/google/firebase/crashlytics/ndk/c;->f(Landroid/content/Context;Z)Lcom/google/firebase/crashlytics/ndk/c;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 3

    const-class v0, Le4/a;

    invoke-static {v0}, Lb4/c;->e(Ljava/lang/Class;)Lb4/c$b;

    move-result-object v0

    const-string v1, "fire-cls-ndk"

    invoke-virtual {v0, v1}, Lb4/c$b;->h(Ljava/lang/String;)Lb4/c$b;

    move-result-object v0

    const-class v2, Landroid/content/Context;

    invoke-static {v2}, Lb4/q;->l(Ljava/lang/Class;)Lb4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    new-instance v2, Lr4/a;

    invoke-direct {v2, p0}, Lr4/a;-><init>(Lcom/google/firebase/crashlytics/ndk/CrashlyticsNdkRegistrar;)V

    invoke-virtual {v0, v2}, Lb4/c$b;->f(Lb4/g;)Lb4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lb4/c$b;->e()Lb4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lb4/c$b;->d()Lb4/c;

    move-result-object v0

    const-string v2, "19.2.1"

    invoke-static {v1, v2}, LL4/h;->b(Ljava/lang/String;Ljava/lang/String;)Lb4/c;

    move-result-object v1

    filled-new-array {v0, v1}, [Lb4/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
