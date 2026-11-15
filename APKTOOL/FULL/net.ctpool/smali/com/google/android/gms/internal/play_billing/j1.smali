.class abstract Lcom/google/android/gms/internal/play_billing/j1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Class;

.field private static final b:Lcom/google/android/gms/internal/play_billing/x1;

.field private static final c:Lcom/google/android/gms/internal/play_billing/x1;

.field public static final synthetic d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.google.protobuf.GeneratedMessage"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-object v1, v0

    :goto_0
    sput-object v1, Lcom/google/android/gms/internal/play_billing/j1;->a:Ljava/lang/Class;

    :try_start_1
    const-string v1, "com.google.protobuf.UnknownFieldSetSchema"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-object v1, v0

    :goto_1
    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    :try_start_2
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/play_billing/x1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v0, v1

    :catchall_2
    :goto_2
    sput-object v0, Lcom/google/android/gms/internal/play_billing/j1;->b:Lcom/google/android/gms/internal/play_billing/x1;

    new-instance v0, Lcom/google/android/gms/internal/play_billing/z1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/z1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/j1;->c:Lcom/google/android/gms/internal/play_billing/x1;

    return-void
.end method

.method public static A(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/P1;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/P1;->g(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static B(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/P1;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/P1;->e(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static C(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/P1;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/P1;->c(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static D(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/P1;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/P1;->f(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static E(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/P1;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/P1;->E(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static F(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/P1;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/P1;->q(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static G(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/P1;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/P1;->z(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static a(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/P1;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/P1;->j(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static b(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/P1;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/P1;->p(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static c(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/P1;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/P1;->u(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static d(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/P1;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/P1;->D(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static e(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/P1;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/P1;->o(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method public static f(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/P1;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/P1;->x(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method

.method static g(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    if-eq p0, p1, :cond_2

    const/4 v1, 0x0

    if-eqz p0, :cond_1

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    move v0, v1

    :cond_2
    :goto_0
    return v0
.end method

.method static h(Ljava/util/List;)I
    .locals 5

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v2, p0, Lcom/google/android/gms/internal/play_billing/s0;

    if-eqz v2, :cond_1

    check-cast p0, Lcom/google/android/gms/internal/play_billing/s0;

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/play_billing/s0;->f(I)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/play_billing/a0;->x(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_1
    if-ge v1, v0, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-long v3, v3

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/play_billing/a0;->x(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return v2
.end method

.method static i(ILjava/util/List;Z)I
    .locals 0

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    shl-int/lit8 p0, p0, 0x3

    invoke-static {p0}, Lcom/google/android/gms/internal/play_billing/a0;->w(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x4

    mul-int/2addr p1, p0

    return p1
.end method

.method static j(Ljava/util/List;)I
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    mul-int/lit8 p0, p0, 0x4

    return p0
.end method

.method static k(ILjava/util/List;Z)I
    .locals 0

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    shl-int/lit8 p0, p0, 0x3

    invoke-static {p0}, Lcom/google/android/gms/internal/play_billing/a0;->w(I)I

    move-result p0

    add-int/lit8 p0, p0, 0x8

    mul-int/2addr p1, p0

    return p1
.end method

.method static l(Ljava/util/List;)I
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    mul-int/lit8 p0, p0, 0x8

    return p0
.end method

.method static m(Ljava/util/List;)I
    .locals 5

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v2, p0, Lcom/google/android/gms/internal/play_billing/s0;

    if-eqz v2, :cond_1

    check-cast p0, Lcom/google/android/gms/internal/play_billing/s0;

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/play_billing/s0;->f(I)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/play_billing/a0;->x(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_1
    if-ge v1, v0, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-long v3, v3

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/play_billing/a0;->x(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return v2
.end method

.method static n(Ljava/util/List;)I
    .locals 5

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v2, p0, Lcom/google/android/gms/internal/play_billing/M0;

    if-eqz v2, :cond_2

    check-cast p0, Lcom/google/android/gms/internal/play_billing/M0;

    if-gtz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    throw p0

    :cond_2
    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_3

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/play_billing/a0;->x(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    move v1, v2

    :goto_1
    return v1
.end method

.method static o(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/h1;)I
    .locals 0

    .line 1
    shl-int/lit8 p0, p0, 0x3

    check-cast p1, Lcom/google/android/gms/internal/play_billing/W0;

    invoke-static {p0}, Lcom/google/android/gms/internal/play_billing/a0;->w(I)I

    move-result p0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/play_billing/a0;->u(Lcom/google/android/gms/internal/play_billing/W0;Lcom/google/android/gms/internal/play_billing/h1;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method

.method static p(Ljava/util/List;)I
    .locals 5

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v2, p0, Lcom/google/android/gms/internal/play_billing/s0;

    if-eqz v2, :cond_1

    check-cast p0, Lcom/google/android/gms/internal/play_billing/s0;

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/play_billing/s0;->f(I)I

    move-result v3

    add-int v4, v3, v3

    shr-int/lit8 v3, v3, 0x1f

    xor-int/2addr v3, v4

    invoke-static {v3}, Lcom/google/android/gms/internal/play_billing/a0;->w(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_1
    if-ge v1, v0, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int v4, v3, v3

    shr-int/lit8 v3, v3, 0x1f

    xor-int/2addr v3, v4

    invoke-static {v3}, Lcom/google/android/gms/internal/play_billing/a0;->w(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return v2
.end method

.method static q(Ljava/util/List;)I
    .locals 8

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v2, p0, Lcom/google/android/gms/internal/play_billing/M0;

    if-eqz v2, :cond_2

    check-cast p0, Lcom/google/android/gms/internal/play_billing/M0;

    if-gtz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    throw p0

    :cond_2
    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_3

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    add-long v5, v3, v3

    const/16 v7, 0x3f

    shr-long/2addr v3, v7

    xor-long/2addr v3, v5

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/play_billing/a0;->x(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    move v1, v2

    :goto_1
    return v1
.end method

.method static r(Ljava/util/List;)I
    .locals 4

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v2, p0, Lcom/google/android/gms/internal/play_billing/s0;

    if-eqz v2, :cond_1

    check-cast p0, Lcom/google/android/gms/internal/play_billing/s0;

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/play_billing/s0;->f(I)I

    move-result v3

    invoke-static {v3}, Lcom/google/android/gms/internal/play_billing/a0;->w(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_1
    if-ge v1, v0, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Lcom/google/android/gms/internal/play_billing/a0;->w(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return v2
.end method

.method static s(Ljava/util/List;)I
    .locals 5

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v2, p0, Lcom/google/android/gms/internal/play_billing/M0;

    if-eqz v2, :cond_2

    check-cast p0, Lcom/google/android/gms/internal/play_billing/M0;

    if-gtz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    throw p0

    :cond_2
    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_3

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/play_billing/a0;->x(J)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    move v1, v2

    :goto_1
    return v1
.end method

.method public static t()Lcom/google/android/gms/internal/play_billing/x1;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/j1;->b:Lcom/google/android/gms/internal/play_billing/x1;

    return-object v0
.end method

.method public static u()Lcom/google/android/gms/internal/play_billing/x1;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/j1;->c:Lcom/google/android/gms/internal/play_billing/x1;

    return-object v0
.end method

.method static v(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/x1;)Ljava/lang/Object;
    .locals 2

    .line 1
    if-nez p3, :cond_0

    invoke-virtual {p4, p0}, Lcom/google/android/gms/internal/play_billing/x1;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    :cond_0
    int-to-long v0, p2

    invoke-virtual {p4, p3, p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/x1;->f(Ljava/lang/Object;IJ)V

    return-object p3
.end method

.method static w(Lcom/google/android/gms/internal/play_billing/g0;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/play_billing/g0;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/k0;

    move-result-object p2

    iget-object v0, p2, Lcom/google/android/gms/internal/play_billing/k0;->a:Lcom/google/android/gms/internal/play_billing/u1;

    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/g0;->c(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/k0;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/play_billing/k0;->f(Lcom/google/android/gms/internal/play_billing/k0;)V

    :cond_0
    return-void
.end method

.method static x(Lcom/google/android/gms/internal/play_billing/x1;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/x1;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/play_billing/x1;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/play_billing/x1;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/x1;->h(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static y(Ljava/lang/Class;)V
    .locals 1

    .line 1
    const-class v0, Lcom/google/android/gms/internal/play_billing/r0;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/j1;->a:Ljava/lang/Class;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Message classes must extend GeneratedMessage or GeneratedMessageLite"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method public static z(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/P1;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/P1;->b(ILjava/util/List;Z)V

    :cond_0
    return-void
.end method
