.class public final Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;
    }
.end annotation


# static fields
.field private static final Companion:Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;

.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-sessions"

.field private static final backgroundDispatcher:Lb4/E;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb4/E;"
        }
    .end annotation
.end field

.field private static final blockingDispatcher:Lb4/E;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb4/E;"
        }
    .end annotation
.end field

.field private static final firebaseApp:Lb4/E;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb4/E;"
        }
    .end annotation
.end field

.field private static final firebaseInstallationsApi:Lb4/E;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb4/E;"
        }
    .end annotation
.end field

.field private static final sessionLifecycleServiceBinder:Lb4/E;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb4/E;"
        }
    .end annotation
.end field

.field private static final sessionsSettings:Lb4/E;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb4/E;"
        }
    .end annotation
.end field

.field private static final transportFactory:Lb4/E;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb4/E;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->Companion:Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;

    const-class v0, LY3/f;

    invoke-static {v0}, Lb4/E;->b(Ljava/lang/Class;)Lb4/E;

    move-result-object v0

    const-string v1, "unqualified(FirebaseApp::class.java)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Lb4/E;

    const-class v0, LE4/e;

    invoke-static {v0}, Lb4/E;->b(Ljava/lang/Class;)Lb4/E;

    move-result-object v0

    const-string v1, "unqualified(FirebaseInstallationsApi::class.java)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Lb4/E;

    const-class v0, La4/a;

    const-class v1, LH5/F;

    invoke-static {v0, v1}, Lb4/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lb4/E;

    move-result-object v0

    const-string v2, "qualified(Background::cl\u2026neDispatcher::class.java)"

    invoke-static {v0, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Lb4/E;

    const-class v0, La4/b;

    invoke-static {v0, v1}, Lb4/E;->a(Ljava/lang/Class;Ljava/lang/Class;)Lb4/E;

    move-result-object v0

    const-string v1, "qualified(Blocking::clas\u2026neDispatcher::class.java)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Lb4/E;

    const-class v0, LS2/j;

    invoke-static {v0}, Lb4/E;->b(Ljava/lang/Class;)Lb4/E;

    move-result-object v0

    const-string v1, "unqualified(TransportFactory::class.java)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Lb4/E;

    const-class v0, LP4/f;

    invoke-static {v0}, Lb4/E;->b(Ljava/lang/Class;)Lb4/E;

    move-result-object v0

    const-string v1, "unqualified(SessionsSettings::class.java)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:Lb4/E;

    const-class v0, LN4/F;

    invoke-static {v0}, Lb4/E;->b(Ljava/lang/Class;)Lb4/E;

    move-result-object v0

    const-string v1, "unqualified(SessionLifec\u2026erviceBinder::class.java)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionLifecycleServiceBinder:Lb4/E;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lb4/d;)Lcom/google/firebase/sessions/a;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$4(Lb4/d;)Lcom/google/firebase/sessions/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lb4/d;)LN4/F;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$5(Lb4/d;)LN4/F;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lb4/d;)LP4/f;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$3(Lb4/d;)LP4/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lb4/d;)Lcom/google/firebase/sessions/b;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$2(Lb4/d;)Lcom/google/firebase/sessions/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lb4/d;)Lcom/google/firebase/sessions/c;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$1(Lb4/d;)Lcom/google/firebase/sessions/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lb4/d;)LN4/k;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$0(Lb4/d;)LN4/k;

    move-result-object p0

    return-object p0
.end method

.method private static final getComponents$lambda$0(Lb4/d;)LN4/k;
    .locals 5

    .line 1
    new-instance v0, LN4/k;

    .line 2
    .line 3
    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Lb4/E;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Lb4/d;->e(Lb4/E;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "container[firebaseApp]"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v1, LY3/f;

    .line 15
    .line 16
    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:Lb4/E;

    .line 17
    .line 18
    invoke-interface {p0, v2}, Lb4/d;->e(Lb4/E;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, "container[sessionsSettings]"

    .line 23
    .line 24
    invoke-static {v2, v3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast v2, LP4/f;

    .line 28
    .line 29
    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Lb4/E;

    .line 30
    .line 31
    invoke-interface {p0, v3}, Lb4/d;->e(Lb4/E;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const-string v4, "container[backgroundDispatcher]"

    .line 36
    .line 37
    invoke-static {v3, v4}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    check-cast v3, Lm5/g;

    .line 41
    .line 42
    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionLifecycleServiceBinder:Lb4/E;

    .line 43
    .line 44
    invoke-interface {p0, v4}, Lb4/d;->e(Lb4/E;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const-string v4, "container[sessionLifecycleServiceBinder]"

    .line 49
    .line 50
    invoke-static {p0, v4}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    check-cast p0, LN4/F;

    .line 54
    .line 55
    invoke-direct {v0, v1, v2, v3, p0}, LN4/k;-><init>(LY3/f;LP4/f;Lm5/g;LN4/F;)V

    .line 56
    .line 57
    .line 58
    return-object v0
.end method

.method private static final getComponents$lambda$1(Lb4/d;)Lcom/google/firebase/sessions/c;
    .locals 3

    .line 1
    new-instance p0, Lcom/google/firebase/sessions/c;

    .line 2
    .line 3
    sget-object v0, LN4/J;->a:LN4/J;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x2

    .line 7
    invoke-direct {p0, v0, v1, v2, v1}, Lcom/google/firebase/sessions/c;-><init>(LN4/I;Lv5/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method private static final getComponents$lambda$2(Lb4/d;)Lcom/google/firebase/sessions/b;
    .locals 7

    .line 1
    new-instance v6, LN4/B;

    .line 2
    .line 3
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Lb4/E;

    .line 4
    .line 5
    invoke-interface {p0, v0}, Lb4/d;->e(Lb4/E;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "container[firebaseApp]"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    move-object v1, v0

    .line 15
    check-cast v1, LY3/f;

    .line 16
    .line 17
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Lb4/E;

    .line 18
    .line 19
    invoke-interface {p0, v0}, Lb4/d;->e(Lb4/E;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v2, "container[firebaseInstallationsApi]"

    .line 24
    .line 25
    invoke-static {v0, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    move-object v2, v0

    .line 29
    check-cast v2, LE4/e;

    .line 30
    .line 31
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:Lb4/E;

    .line 32
    .line 33
    invoke-interface {p0, v0}, Lb4/d;->e(Lb4/E;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v3, "container[sessionsSettings]"

    .line 38
    .line 39
    invoke-static {v0, v3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    move-object v3, v0

    .line 43
    check-cast v3, LP4/f;

    .line 44
    .line 45
    new-instance v4, LN4/g;

    .line 46
    .line 47
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Lb4/E;

    .line 48
    .line 49
    invoke-interface {p0, v0}, Lb4/d;->f(Lb4/E;)LD4/b;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const-string v5, "container.getProvider(transportFactory)"

    .line 54
    .line 55
    invoke-static {v0, v5}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-direct {v4, v0}, LN4/g;-><init>(LD4/b;)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Lb4/E;

    .line 62
    .line 63
    invoke-interface {p0, v0}, Lb4/d;->e(Lb4/E;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const-string v0, "container[backgroundDispatcher]"

    .line 68
    .line 69
    invoke-static {p0, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    move-object v5, p0

    .line 73
    check-cast v5, Lm5/g;

    .line 74
    .line 75
    move-object v0, v6

    .line 76
    invoke-direct/range {v0 .. v5}, LN4/B;-><init>(LY3/f;LE4/e;LP4/f;LN4/h;Lm5/g;)V

    .line 77
    .line 78
    .line 79
    return-object v6
.end method

.method private static final getComponents$lambda$3(Lb4/d;)LP4/f;
    .locals 5

    .line 1
    new-instance v0, LP4/f;

    .line 2
    .line 3
    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Lb4/E;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Lb4/d;->e(Lb4/E;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "container[firebaseApp]"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v1, LY3/f;

    .line 15
    .line 16
    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Lb4/E;

    .line 17
    .line 18
    invoke-interface {p0, v2}, Lb4/d;->e(Lb4/E;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, "container[blockingDispatcher]"

    .line 23
    .line 24
    invoke-static {v2, v3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast v2, Lm5/g;

    .line 28
    .line 29
    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Lb4/E;

    .line 30
    .line 31
    invoke-interface {p0, v3}, Lb4/d;->e(Lb4/E;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const-string v4, "container[backgroundDispatcher]"

    .line 36
    .line 37
    invoke-static {v3, v4}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    check-cast v3, Lm5/g;

    .line 41
    .line 42
    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Lb4/E;

    .line 43
    .line 44
    invoke-interface {p0, v4}, Lb4/d;->e(Lb4/E;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const-string v4, "container[firebaseInstallationsApi]"

    .line 49
    .line 50
    invoke-static {p0, v4}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    check-cast p0, LE4/e;

    .line 54
    .line 55
    invoke-direct {v0, v1, v2, v3, p0}, LP4/f;-><init>(LY3/f;Lm5/g;Lm5/g;LE4/e;)V

    .line 56
    .line 57
    .line 58
    return-object v0
.end method

.method private static final getComponents$lambda$4(Lb4/d;)Lcom/google/firebase/sessions/a;
    .locals 3

    .line 1
    new-instance v0, LN4/x;

    .line 2
    .line 3
    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Lb4/E;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Lb4/d;->e(Lb4/E;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, LY3/f;

    .line 10
    .line 11
    invoke-virtual {v1}, LY3/f;->m()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "container[firebaseApp].applicationContext"

    .line 16
    .line 17
    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Lb4/E;

    .line 21
    .line 22
    invoke-interface {p0, v2}, Lb4/d;->e(Lb4/E;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v2, "container[backgroundDispatcher]"

    .line 27
    .line 28
    invoke-static {p0, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    check-cast p0, Lm5/g;

    .line 32
    .line 33
    invoke-direct {v0, v1, p0}, LN4/x;-><init>(Landroid/content/Context;Lm5/g;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method private static final getComponents$lambda$5(Lb4/d;)LN4/F;
    .locals 2

    .line 1
    new-instance v0, LN4/G;

    .line 2
    .line 3
    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Lb4/E;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Lb4/d;->e(Lb4/E;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v1, "container[firebaseApp]"

    .line 10
    .line 11
    invoke-static {p0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast p0, LY3/f;

    .line 15
    .line 16
    invoke-direct {v0, p0}, LN4/G;-><init>(LY3/f;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lb4/c;",
            ">;"
        }
    .end annotation

    const-class v0, LN4/k;

    invoke-static {v0}, Lb4/c;->e(Ljava/lang/Class;)Lb4/c$b;

    move-result-object v0

    const-string v1, "fire-sessions"

    invoke-virtual {v0, v1}, Lb4/c$b;->h(Ljava/lang/String;)Lb4/c$b;

    move-result-object v0

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Lb4/E;

    invoke-static {v2}, Lb4/q;->k(Lb4/E;)Lb4/q;

    move-result-object v3

    invoke-virtual {v0, v3}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:Lb4/E;

    invoke-static {v3}, Lb4/q;->k(Lb4/E;)Lb4/q;

    move-result-object v4

    invoke-virtual {v0, v4}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Lb4/E;

    invoke-static {v4}, Lb4/q;->k(Lb4/E;)Lb4/q;

    move-result-object v5

    invoke-virtual {v0, v5}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    sget-object v5, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionLifecycleServiceBinder:Lb4/E;

    invoke-static {v5}, Lb4/q;->k(Lb4/E;)Lb4/q;

    move-result-object v5

    invoke-virtual {v0, v5}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    new-instance v5, LN4/m;

    invoke-direct {v5}, LN4/m;-><init>()V

    invoke-virtual {v0, v5}, Lb4/c$b;->f(Lb4/g;)Lb4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lb4/c$b;->e()Lb4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lb4/c$b;->d()Lb4/c;

    move-result-object v5

    const-class v0, Lcom/google/firebase/sessions/c;

    invoke-static {v0}, Lb4/c;->e(Ljava/lang/Class;)Lb4/c$b;

    move-result-object v0

    const-string v6, "session-generator"

    invoke-virtual {v0, v6}, Lb4/c$b;->h(Ljava/lang/String;)Lb4/c$b;

    move-result-object v0

    new-instance v6, LN4/n;

    invoke-direct {v6}, LN4/n;-><init>()V

    invoke-virtual {v0, v6}, Lb4/c$b;->f(Lb4/g;)Lb4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lb4/c$b;->d()Lb4/c;

    move-result-object v6

    const-class v0, Lcom/google/firebase/sessions/b;

    invoke-static {v0}, Lb4/c;->e(Ljava/lang/Class;)Lb4/c$b;

    move-result-object v0

    const-string v7, "session-publisher"

    invoke-virtual {v0, v7}, Lb4/c$b;->h(Ljava/lang/String;)Lb4/c$b;

    move-result-object v0

    invoke-static {v2}, Lb4/q;->k(Lb4/E;)Lb4/q;

    move-result-object v7

    invoke-virtual {v0, v7}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    sget-object v7, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Lb4/E;

    invoke-static {v7}, Lb4/q;->k(Lb4/E;)Lb4/q;

    move-result-object v8

    invoke-virtual {v0, v8}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    invoke-static {v3}, Lb4/q;->k(Lb4/E;)Lb4/q;

    move-result-object v3

    invoke-virtual {v0, v3}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Lb4/E;

    invoke-static {v3}, Lb4/q;->m(Lb4/E;)Lb4/q;

    move-result-object v3

    invoke-virtual {v0, v3}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    invoke-static {v4}, Lb4/q;->k(Lb4/E;)Lb4/q;

    move-result-object v3

    invoke-virtual {v0, v3}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v0

    new-instance v3, LN4/o;

    invoke-direct {v3}, LN4/o;-><init>()V

    invoke-virtual {v0, v3}, Lb4/c$b;->f(Lb4/g;)Lb4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lb4/c$b;->d()Lb4/c;

    move-result-object v0

    const-class v3, LP4/f;

    invoke-static {v3}, Lb4/c;->e(Ljava/lang/Class;)Lb4/c$b;

    move-result-object v3

    const-string v8, "sessions-settings"

    invoke-virtual {v3, v8}, Lb4/c$b;->h(Ljava/lang/String;)Lb4/c$b;

    move-result-object v3

    invoke-static {v2}, Lb4/q;->k(Lb4/E;)Lb4/q;

    move-result-object v8

    invoke-virtual {v3, v8}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v3

    sget-object v8, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Lb4/E;

    invoke-static {v8}, Lb4/q;->k(Lb4/E;)Lb4/q;

    move-result-object v8

    invoke-virtual {v3, v8}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v3

    invoke-static {v4}, Lb4/q;->k(Lb4/E;)Lb4/q;

    move-result-object v8

    invoke-virtual {v3, v8}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v3

    invoke-static {v7}, Lb4/q;->k(Lb4/E;)Lb4/q;

    move-result-object v7

    invoke-virtual {v3, v7}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v3

    new-instance v7, LN4/p;

    invoke-direct {v7}, LN4/p;-><init>()V

    invoke-virtual {v3, v7}, Lb4/c$b;->f(Lb4/g;)Lb4/c$b;

    move-result-object v3

    invoke-virtual {v3}, Lb4/c$b;->d()Lb4/c;

    move-result-object v8

    const-class v3, Lcom/google/firebase/sessions/a;

    invoke-static {v3}, Lb4/c;->e(Ljava/lang/Class;)Lb4/c$b;

    move-result-object v3

    const-string v7, "sessions-datastore"

    invoke-virtual {v3, v7}, Lb4/c$b;->h(Ljava/lang/String;)Lb4/c$b;

    move-result-object v3

    invoke-static {v2}, Lb4/q;->k(Lb4/E;)Lb4/q;

    move-result-object v7

    invoke-virtual {v3, v7}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v3

    invoke-static {v4}, Lb4/q;->k(Lb4/E;)Lb4/q;

    move-result-object v4

    invoke-virtual {v3, v4}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v3

    new-instance v4, LN4/q;

    invoke-direct {v4}, LN4/q;-><init>()V

    invoke-virtual {v3, v4}, Lb4/c$b;->f(Lb4/g;)Lb4/c$b;

    move-result-object v3

    invoke-virtual {v3}, Lb4/c$b;->d()Lb4/c;

    move-result-object v9

    const-class v3, LN4/F;

    invoke-static {v3}, Lb4/c;->e(Ljava/lang/Class;)Lb4/c$b;

    move-result-object v3

    const-string v4, "sessions-service-binder"

    invoke-virtual {v3, v4}, Lb4/c$b;->h(Ljava/lang/String;)Lb4/c$b;

    move-result-object v3

    invoke-static {v2}, Lb4/q;->k(Lb4/E;)Lb4/q;

    move-result-object v2

    invoke-virtual {v3, v2}, Lb4/c$b;->b(Lb4/q;)Lb4/c$b;

    move-result-object v2

    new-instance v3, LN4/r;

    invoke-direct {v3}, LN4/r;-><init>()V

    invoke-virtual {v2, v3}, Lb4/c$b;->f(Lb4/g;)Lb4/c$b;

    move-result-object v2

    invoke-virtual {v2}, Lb4/c$b;->d()Lb4/c;

    move-result-object v10

    const-string v2, "2.0.6"

    invoke-static {v1, v2}, LL4/h;->b(Ljava/lang/String;Ljava/lang/String;)Lb4/c;

    move-result-object v11

    move-object v7, v0

    filled-new-array/range {v5 .. v11}, [Lb4/c;

    move-result-object v0

    invoke-static {v0}, Lj5/n;->k([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
