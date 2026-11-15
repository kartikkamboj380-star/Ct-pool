.class public Lcom/google/firebase/datatransport/TransportRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-transport"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lb4/d;)LS2/j;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$2(Lb4/d;)LS2/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lb4/d;)LS2/j;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$1(Lb4/d;)LS2/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lb4/d;)LS2/j;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$0(Lb4/d;)LS2/j;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lb4/d;)LS2/j;
    .locals 1

    .line 1
    const-class v0, Landroid/content/Context;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lb4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {p0}, LU2/u;->f(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, LU2/u;->c()LU2/u;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v0, Lcom/google/android/datatransport/cct/a;->h:Lcom/google/android/datatransport/cct/a;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, LU2/u;->g(LU2/f;)LS2/j;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method private static synthetic lambda$getComponents$1(Lb4/d;)LS2/j;
    .locals 1

    .line 1
    const-class v0, Landroid/content/Context;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lb4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {p0}, LU2/u;->f(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, LU2/u;->c()LU2/u;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v0, Lcom/google/android/datatransport/cct/a;->h:Lcom/google/android/datatransport/cct/a;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, LU2/u;->g(LU2/f;)LS2/j;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method private static synthetic lambda$getComponents$2(Lb4/d;)LS2/j;
    .locals 1

    .line 1
    const-class v0, Landroid/content/Context;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lb4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {p0}, LU2/u;->f(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, LU2/u;->c()LU2/u;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v0, Lcom/google/android/datatransport/cct/a;->g:Lcom/google/android/datatransport/cct/a;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, LU2/u;->g(LU2/f;)LS2/j;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lb4/c;",
            ">;"
        }
    .end annotation

    const-class v0, LS2/j;

    invoke-static {v0}, Lb4/c;->e(Ljava/lang/Class;)Lb4/c$b;

    move-result-object v1

    const-string v2, "fire-transport"

    invoke-virtual {v1, v2}, Lb4/c$b;->h(Ljava/lang/String;)Lb4/c$b;

    move-result-object v1

    const-class v3, Landroid/content/Context;

    invoke-static {v3}, Lb4/q;->l(Ljava/lang/Class;)Lb4/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v1

    new-instance v4, Ls4/c;

    invoke-direct {v4}, Ls4/c;-><init>()V

    invoke-virtual {v1, v4}, Lb4/c$b;->f(Lb4/g;)Lb4/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lb4/c$b;->d()Lb4/c;

    move-result-object v1

    const-class v4, Ls4/a;

    invoke-static {v4, v0}, Lb4/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lb4/E;

    move-result-object v4

    invoke-static {v4}, Lb4/c;->c(Lb4/E;)Lb4/c$b;

    move-result-object v4

    invoke-static {v3}, Lb4/q;->l(Ljava/lang/Class;)Lb4/q;

    move-result-object v5

    invoke-virtual {v4, v5}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v4

    new-instance v5, Ls4/d;

    invoke-direct {v5}, Ls4/d;-><init>()V

    invoke-virtual {v4, v5}, Lb4/c$b;->f(Lb4/g;)Lb4/c$b;

    move-result-object v4

    invoke-virtual {v4}, Lb4/c$b;->d()Lb4/c;

    move-result-object v4

    const-class v5, Ls4/b;

    invoke-static {v5, v0}, Lb4/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lb4/E;

    move-result-object v0

    invoke-static {v0}, Lb4/c;->c(Lb4/E;)Lb4/c$b;

    move-result-object v0

    invoke-static {v3}, Lb4/q;->l(Ljava/lang/Class;)Lb4/q;

    move-result-object v3

    invoke-virtual {v0, v3}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    new-instance v3, Ls4/e;

    invoke-direct {v3}, Ls4/e;-><init>()V

    invoke-virtual {v0, v3}, Lb4/c$b;->f(Lb4/g;)Lb4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lb4/c$b;->d()Lb4/c;

    move-result-object v0

    const-string v3, "19.0.0"

    invoke-static {v2, v3}, LL4/h;->b(Ljava/lang/String;Ljava/lang/String;)Lb4/c;

    move-result-object v2

    filled-new-array {v1, v4, v0, v2}, [Lb4/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
