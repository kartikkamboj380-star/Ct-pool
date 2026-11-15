.class public final Lcom/google/firebase/dynamiclinks/internal/FirebaseDynamicLinkRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-dl"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lb4/d;)Lt4/b;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/dynamiclinks/internal/FirebaseDynamicLinkRegistrar;->lambda$getComponents$0(Lb4/d;)Lt4/b;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lb4/d;)Lt4/b;
    .locals 3

    .line 1
    new-instance v0, Lu4/g;

    .line 2
    .line 3
    const-class v1, LY3/f;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Lb4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, LY3/f;

    .line 10
    .line 11
    const-class v2, LZ3/a;

    .line 12
    .line 13
    invoke-interface {p0, v2}, Lb4/d;->b(Ljava/lang/Class;)LD4/b;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {v0, v1, p0}, Lu4/g;-><init>(LY3/f;LD4/b;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 3
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lb4/c;",
            ">;"
        }
    .end annotation

    const-class v0, Lt4/b;

    invoke-static {v0}, Lb4/c;->e(Ljava/lang/Class;)Lb4/c$b;

    move-result-object v0

    const-string v1, "fire-dl"

    invoke-virtual {v0, v1}, Lb4/c$b;->h(Ljava/lang/String;)Lb4/c$b;

    move-result-object v0

    const-class v2, LY3/f;

    invoke-static {v2}, Lb4/q;->l(Ljava/lang/Class;)Lb4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    const-class v2, LZ3/a;

    invoke-static {v2}, Lb4/q;->j(Ljava/lang/Class;)Lb4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    new-instance v2, Lu4/f;

    invoke-direct {v2}, Lu4/f;-><init>()V

    invoke-virtual {v0, v2}, Lb4/c$b;->f(Lb4/g;)Lb4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lb4/c$b;->d()Lb4/c;

    move-result-object v0

    const-string v2, "22.1.0"

    invoke-static {v1, v2}, LL4/h;->b(Ljava/lang/String;Ljava/lang/String;)Lb4/c;

    move-result-object v1

    filled-new-array {v0, v1}, [Lb4/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
