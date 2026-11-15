.class public LD1/b;
.super LD1/a;
.source "SourceFile"

# interfaces
.implements LD1/e;


# static fields
.field private static u:Z = false


# instance fields
.field private p:LS0/a;

.field private volatile q:Landroid/graphics/Bitmap;

.field private final r:LD1/l;

.field private final s:I

.field private final t:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method protected constructor <init>(LS0/a;LD1/l;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, LD1/a;-><init>()V

    invoke-virtual {p1}, LS0/a;->d()LS0/a;

    move-result-object p1

    invoke-static {p1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LS0/a;

    iput-object p1, p0, LD1/b;->p:LS0/a;

    invoke-virtual {p1}, LS0/a;->j()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    iput-object p1, p0, LD1/b;->q:Landroid/graphics/Bitmap;

    iput-object p2, p0, LD1/b;->r:LD1/l;

    iput p3, p0, LD1/b;->s:I

    iput p4, p0, LD1/b;->t:I

    return-void
.end method

.method protected constructor <init>(Landroid/graphics/Bitmap;LS0/g;LD1/l;II)V
    .locals 0

    .line 2
    invoke-direct {p0}, LD1/a;-><init>()V

    invoke-static {p1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    iput-object p1, p0, LD1/b;->q:Landroid/graphics/Bitmap;

    iget-object p1, p0, LD1/b;->q:Landroid/graphics/Bitmap;

    invoke-static {p2}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LS0/g;

    invoke-static {p1, p2}, LS0/a;->W(Ljava/lang/Object;LS0/g;)LS0/a;

    move-result-object p1

    iput-object p1, p0, LD1/b;->p:LS0/a;

    iput-object p3, p0, LD1/b;->r:LD1/l;

    iput p4, p0, LD1/b;->s:I

    iput p5, p0, LD1/b;->t:I

    return-void
.end method

.method private declared-synchronized W()LS0/a;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LD1/b;->p:LS0/a;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, LD1/b;->p:LS0/a;

    .line 6
    .line 7
    iput-object v1, p0, LD1/b;->q:Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return-object v0

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    monitor-exit p0

    .line 13
    throw v0
.end method

.method private static a0(Landroid/graphics/Bitmap;)I
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    :goto_0
    return p0
.end method

.method private static h0(Landroid/graphics/Bitmap;)I
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    :goto_0
    return p0
.end method

.method public static j0()Z
    .locals 1

    .line 1
    sget-boolean v0, LD1/b;->u:Z

    .line 2
    .line 3
    return v0
.end method


# virtual methods
.method public T()I
    .locals 1

    .line 1
    iget v0, p0, LD1/b;->s:I

    .line 2
    .line 3
    return v0
.end method

.method public T0()I
    .locals 1

    .line 1
    iget-object v0, p0, LD1/b;->q:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-static {v0}, LN1/b;->g(Landroid/graphics/Bitmap;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public close()V
    .locals 1

    .line 1
    invoke-direct {p0}, LD1/b;->W()LS0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, LS0/a;->close()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public g1()I
    .locals 1

    .line 1
    iget v0, p0, LD1/b;->t:I

    .line 2
    .line 3
    return v0
.end method

.method public getHeight()I
    .locals 2

    .line 1
    iget v0, p0, LD1/b;->s:I

    .line 2
    .line 3
    rem-int/lit16 v0, v0, 0xb4

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, LD1/b;->t:I

    .line 8
    .line 9
    const/4 v1, 0x5

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x7

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, LD1/b;->q:Landroid/graphics/Bitmap;

    .line 17
    .line 18
    invoke-static {v0}, LD1/b;->a0(Landroid/graphics/Bitmap;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0

    .line 23
    :cond_1
    :goto_0
    iget-object v0, p0, LD1/b;->q:Landroid/graphics/Bitmap;

    .line 24
    .line 25
    invoke-static {v0}, LD1/b;->h0(Landroid/graphics/Bitmap;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0
.end method

.method public getWidth()I
    .locals 2

    .line 1
    iget v0, p0, LD1/b;->s:I

    .line 2
    .line 3
    rem-int/lit16 v0, v0, 0xb4

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, LD1/b;->t:I

    .line 8
    .line 9
    const/4 v1, 0x5

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x7

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, LD1/b;->q:Landroid/graphics/Bitmap;

    .line 17
    .line 18
    invoke-static {v0}, LD1/b;->h0(Landroid/graphics/Bitmap;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0

    .line 23
    :cond_1
    :goto_0
    iget-object v0, p0, LD1/b;->q:Landroid/graphics/Bitmap;

    .line 24
    .line 25
    invoke-static {v0}, LD1/b;->a0(Landroid/graphics/Bitmap;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0
.end method

.method public declared-synchronized isClosed()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LD1/b;->p:LS0/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    monitor-exit p0

    .line 10
    return v0

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    monitor-exit p0

    .line 13
    throw v0
.end method

.method public t0()LD1/l;
    .locals 1

    .line 1
    iget-object v0, p0, LD1/b;->r:LD1/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public z0()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, LD1/b;->q:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object v0
.end method
