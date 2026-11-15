.class final LU/n$a;
.super LU/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final b:Landroid/adservices/measurement/MeasurementManager;


# direct methods
.method public constructor <init>(Landroid/adservices/measurement/MeasurementManager;)V
    .locals 1

    .line 1
    const-string v0, "mMeasurementManager"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LU/n;-><init>()V

    iput-object p1, p0, LU/n$a;->b:Landroid/adservices/measurement/MeasurementManager;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LU/f;->a()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "context.getSystemService\u2026:class.java\n            )"

    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LU/g;->a(Ljava/lang/Object;)Landroid/adservices/measurement/MeasurementManager;

    move-result-object p1

    invoke-direct {p0, p1}, LU/n$a;-><init>(Landroid/adservices/measurement/MeasurementManager;)V

    return-void
.end method

.method public static final synthetic g(LU/n$a;LU/a;)Landroid/adservices/measurement/DeletionRequest;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LU/n$a;->k(LU/a;)Landroid/adservices/measurement/DeletionRequest;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic h(LU/n$a;LU/o;)Landroid/adservices/measurement/WebSourceRegistrationRequest;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LU/n$a;->l(LU/o;)Landroid/adservices/measurement/WebSourceRegistrationRequest;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic i(LU/n$a;LU/p;)Landroid/adservices/measurement/WebTriggerRegistrationRequest;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LU/n$a;->m(LU/p;)Landroid/adservices/measurement/WebTriggerRegistrationRequest;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic j(LU/n$a;)Landroid/adservices/measurement/MeasurementManager;
    .locals 0

    .line 1
    iget-object p0, p0, LU/n$a;->b:Landroid/adservices/measurement/MeasurementManager;

    .line 2
    .line 3
    return-object p0
.end method

.method private final k(LU/a;)Landroid/adservices/measurement/DeletionRequest;
    .locals 0

    .line 1
    invoke-static {}, LU/k;->a()Landroid/adservices/measurement/DeletionRequest$Builder;

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    throw p1
.end method

.method private final l(LU/o;)Landroid/adservices/measurement/WebSourceRegistrationRequest;
    .locals 0

    .line 1
    invoke-static {}, LU/l;->a()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    throw p1
.end method

.method private final m(LU/p;)Landroid/adservices/measurement/WebTriggerRegistrationRequest;
    .locals 0

    .line 1
    invoke-static {}, LU/c;->a()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    throw p1
.end method


# virtual methods
.method public a(LU/a;Lm5/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LU/a;",
            "Lm5/d;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, LH5/m;

    .line 2
    .line 3
    invoke-static {p2}, Ln5/b;->b(Lm5/d;)Lm5/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, LH5/m;-><init>(Lm5/d;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LH5/m;->C()V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, LU/n$a;->j(LU/n$a;)Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {p0, p1}, LU/n$a;->g(LU/n$a;LU/a;)Landroid/adservices/measurement/DeletionRequest;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v2, LU/m;

    .line 23
    .line 24
    invoke-direct {v2}, LU/m;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Landroidx/core/os/n;->a(Lm5/d;)Landroid/os/OutcomeReceiver;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {v1, p1, v2, v3}, LU/e;->a(Landroid/adservices/measurement/MeasurementManager;Landroid/adservices/measurement/DeletionRequest;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, LH5/m;->z()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-ne p1, v0, :cond_0

    .line 43
    .line 44
    invoke-static {p2}, Lo5/h;->c(Lm5/d;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    if-ne p1, p2, :cond_1

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_1
    sget-object p1, Li5/u;->a:Li5/u;

    .line 55
    .line 56
    return-object p1
.end method

.method public b(Lm5/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm5/d;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, LH5/m;

    .line 2
    .line 3
    invoke-static {p1}, Ln5/b;->b(Lm5/d;)Lm5/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, LH5/m;-><init>(Lm5/d;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LH5/m;->C()V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, LU/n$a;->j(LU/n$a;)Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, LU/m;

    .line 19
    .line 20
    invoke-direct {v2}, LU/m;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Landroidx/core/os/n;->a(Lm5/d;)Landroid/os/OutcomeReceiver;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {v1, v2, v3}, LU/h;->a(Landroid/adservices/measurement/MeasurementManager;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, LH5/m;->z()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-ne v0, v1, :cond_0

    .line 39
    .line 40
    invoke-static {p1}, Lo5/h;->c(Lm5/d;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-object v0
.end method

.method public c(Landroid/net/Uri;Landroid/view/InputEvent;Lm5/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/view/InputEvent;",
            "Lm5/d;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, LH5/m;

    .line 2
    .line 3
    invoke-static {p3}, Ln5/b;->b(Lm5/d;)Lm5/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, LH5/m;-><init>(Lm5/d;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LH5/m;->C()V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, LU/n$a;->j(LU/n$a;)Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, LU/m;

    .line 19
    .line 20
    invoke-direct {v2}, LU/m;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Landroidx/core/os/n;->a(Lm5/d;)Landroid/os/OutcomeReceiver;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {v1, p1, p2, v2, v3}, LU/b;->a(Landroid/adservices/measurement/MeasurementManager;Landroid/net/Uri;Landroid/view/InputEvent;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, LH5/m;->z()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    if-ne p1, p2, :cond_0

    .line 39
    .line 40
    invoke-static {p3}, Lo5/h;->c(Lm5/d;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    if-ne p1, p2, :cond_1

    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_1
    sget-object p1, Li5/u;->a:Li5/u;

    .line 51
    .line 52
    return-object p1
.end method

.method public d(Landroid/net/Uri;Lm5/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lm5/d;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, LH5/m;

    .line 2
    .line 3
    invoke-static {p2}, Ln5/b;->b(Lm5/d;)Lm5/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, LH5/m;-><init>(Lm5/d;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LH5/m;->C()V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, LU/n$a;->j(LU/n$a;)Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, LU/m;

    .line 19
    .line 20
    invoke-direct {v2}, LU/m;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Landroidx/core/os/n;->a(Lm5/d;)Landroid/os/OutcomeReceiver;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {v1, p1, v2, v3}, LU/i;->a(Landroid/adservices/measurement/MeasurementManager;Landroid/net/Uri;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, LH5/m;->z()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-ne p1, v0, :cond_0

    .line 39
    .line 40
    invoke-static {p2}, Lo5/h;->c(Lm5/d;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    if-ne p1, p2, :cond_1

    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_1
    sget-object p1, Li5/u;->a:Li5/u;

    .line 51
    .line 52
    return-object p1
.end method

.method public e(LU/o;Lm5/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LU/o;",
            "Lm5/d;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, LH5/m;

    .line 2
    .line 3
    invoke-static {p2}, Ln5/b;->b(Lm5/d;)Lm5/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, LH5/m;-><init>(Lm5/d;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LH5/m;->C()V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, LU/n$a;->j(LU/n$a;)Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {p0, p1}, LU/n$a;->h(LU/n$a;LU/o;)Landroid/adservices/measurement/WebSourceRegistrationRequest;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v2, LU/m;

    .line 23
    .line 24
    invoke-direct {v2}, LU/m;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Landroidx/core/os/n;->a(Lm5/d;)Landroid/os/OutcomeReceiver;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {v1, p1, v2, v3}, LU/d;->a(Landroid/adservices/measurement/MeasurementManager;Landroid/adservices/measurement/WebSourceRegistrationRequest;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, LH5/m;->z()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-ne p1, v0, :cond_0

    .line 43
    .line 44
    invoke-static {p2}, Lo5/h;->c(Lm5/d;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    if-ne p1, p2, :cond_1

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_1
    sget-object p1, Li5/u;->a:Li5/u;

    .line 55
    .line 56
    return-object p1
.end method

.method public f(LU/p;Lm5/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LU/p;",
            "Lm5/d;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, LH5/m;

    .line 2
    .line 3
    invoke-static {p2}, Ln5/b;->b(Lm5/d;)Lm5/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, LH5/m;-><init>(Lm5/d;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LH5/m;->C()V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, LU/n$a;->j(LU/n$a;)Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {p0, p1}, LU/n$a;->i(LU/n$a;LU/p;)Landroid/adservices/measurement/WebTriggerRegistrationRequest;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v2, LU/m;

    .line 23
    .line 24
    invoke-direct {v2}, LU/m;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Landroidx/core/os/n;->a(Lm5/d;)Landroid/os/OutcomeReceiver;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {v1, p1, v2, v3}, LU/j;->a(Landroid/adservices/measurement/MeasurementManager;Landroid/adservices/measurement/WebTriggerRegistrationRequest;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, LH5/m;->z()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-ne p1, v0, :cond_0

    .line 43
    .line 44
    invoke-static {p2}, Lo5/h;->c(Lm5/d;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-static {}, Ln5/b;->c()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    if-ne p1, p2, :cond_1

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_1
    sget-object p1, Li5/u;->a:Li5/u;

    .line 55
    .line 56
    return-object p1
.end method
