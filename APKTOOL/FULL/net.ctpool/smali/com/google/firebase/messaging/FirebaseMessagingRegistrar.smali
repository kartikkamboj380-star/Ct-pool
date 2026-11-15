.class public Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;
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
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-fcm"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lb4/E;Lb4/d;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;->lambda$getComponents$0(Lb4/E;Lb4/d;)Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lb4/E;Lb4/d;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 9

    .line 1
    new-instance v8, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    const-class v0, LY3/f;

    .line 4
    .line 5
    invoke-interface {p1, v0}, Lb4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, LY3/f;

    .line 11
    .line 12
    const-class v0, LC4/a;

    .line 13
    .line 14
    invoke-interface {p1, v0}, Lb4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const-class v0, LL4/i;

    .line 22
    .line 23
    invoke-interface {p1, v0}, Lb4/d;->b(Ljava/lang/Class;)LD4/b;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-class v0, LB4/j;

    .line 28
    .line 29
    invoke-interface {p1, v0}, Lb4/d;->b(Ljava/lang/Class;)LD4/b;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    const-class v0, LE4/e;

    .line 34
    .line 35
    invoke-interface {p1, v0}, Lb4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    move-object v5, v0

    .line 40
    check-cast v5, LE4/e;

    .line 41
    .line 42
    invoke-interface {p1, p0}, Lb4/d;->f(Lb4/E;)LD4/b;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    const-class p0, LA4/d;

    .line 47
    .line 48
    invoke-interface {p1, p0}, Lb4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    move-object v7, p0

    .line 53
    check-cast v7, LA4/d;

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    move-object v0, v8

    .line 57
    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/messaging/FirebaseMessaging;-><init>(LY3/f;LC4/a;LD4/b;LD4/b;LE4/e;LD4/b;LA4/d;)V

    .line 58
    .line 59
    .line 60
    return-object v8
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
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

    const-class v0, Ls4/b;

    const-class v1, LS2/j;

    invoke-static {v0, v1}, Lb4/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lb4/E;

    move-result-object v0

    const-class v1, Lcom/google/firebase/messaging/FirebaseMessaging;

    invoke-static {v1}, Lb4/c;->e(Ljava/lang/Class;)Lb4/c$b;

    move-result-object v1

    const-string v2, "fire-fcm"

    invoke-virtual {v1, v2}, Lb4/c$b;->h(Ljava/lang/String;)Lb4/c$b;

    move-result-object v1

    const-class v3, LY3/f;

    invoke-static {v3}, Lb4/q;->l(Ljava/lang/Class;)Lb4/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v1

    const-class v3, LC4/a;

    invoke-static {v3}, Lb4/q;->h(Ljava/lang/Class;)Lb4/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v1

    const-class v3, LL4/i;

    invoke-static {v3}, Lb4/q;->j(Ljava/lang/Class;)Lb4/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v1

    const-class v3, LB4/j;

    invoke-static {v3}, Lb4/q;->j(Ljava/lang/Class;)Lb4/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v1

    const-class v3, LE4/e;

    invoke-static {v3}, Lb4/q;->l(Ljava/lang/Class;)Lb4/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v1

    invoke-static {v0}, Lb4/q;->i(Lb4/E;)Lb4/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v1

    const-class v3, LA4/d;

    invoke-static {v3}, Lb4/q;->l(Ljava/lang/Class;)Lb4/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v1

    new-instance v3, Lcom/google/firebase/messaging/E;

    invoke-direct {v3, v0}, Lcom/google/firebase/messaging/E;-><init>(Lb4/E;)V

    invoke-virtual {v1, v3}, Lb4/c$b;->f(Lb4/g;)Lb4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lb4/c$b;->c()Lb4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lb4/c$b;->d()Lb4/c;

    move-result-object v0

    const-string v1, "24.0.3"

    invoke-static {v2, v1}, LL4/h;->b(Ljava/lang/String;Ljava/lang/String;)Lb4/c;

    move-result-object v1

    filled-new-array {v0, v1}, [Lb4/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
