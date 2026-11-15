.class public final Lb6/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li6/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb6/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private final r:Li6/h;


# direct methods
.method public constructor <init>(Li6/h;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lb6/h$b;->r:Li6/h;

    .line 10
    .line 11
    return-void
.end method

.method private final b()V
    .locals 9

    .line 1
    iget v0, p0, Lb6/h$b;->o:I

    iget-object v1, p0, Lb6/h$b;->r:Li6/h;

    invoke-static {v1}, LU5/c;->H(Li6/h;)I

    move-result v1

    iput v1, p0, Lb6/h$b;->p:I

    iput v1, p0, Lb6/h$b;->m:I

    iget-object v1, p0, Lb6/h$b;->r:Li6/h;

    invoke-interface {v1}, Li6/h;->q0()B

    move-result v1

    const/16 v2, 0xff

    invoke-static {v1, v2}, LU5/c;->b(BI)I

    move-result v1

    iget-object v3, p0, Lb6/h$b;->r:Li6/h;

    invoke-interface {v3}, Li6/h;->q0()B

    move-result v3

    invoke-static {v3, v2}, LU5/c;->b(BI)I

    move-result v2

    iput v2, p0, Lb6/h$b;->n:I

    sget-object v2, Lb6/h;->r:Lb6/h$a;

    invoke-virtual {v2}, Lb6/h$a;->a()Ljava/util/logging/Logger;

    move-result-object v3

    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lb6/h$a;->a()Ljava/util/logging/Logger;

    move-result-object v2

    sget-object v3, Lb6/e;->e:Lb6/e;

    iget v5, p0, Lb6/h$b;->o:I

    iget v6, p0, Lb6/h$b;->m:I

    iget v8, p0, Lb6/h$b;->n:I

    const/4 v4, 0x1

    move v7, v1

    invoke-virtual/range {v3 .. v8}, Lb6/e;->c(ZIIII)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_0
    iget-object v2, p0, Lb6/h$b;->r:Li6/h;

    invoke-interface {v2}, Li6/h;->F()I

    move-result v2

    const v3, 0x7fffffff

    and-int/2addr v2, v3

    iput v2, p0, Lb6/h$b;->o:I

    const/16 v3, 0x9

    if-ne v1, v3, :cond_2

    if-ne v2, v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "TYPE_CONTINUATION streamId changed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " != TYPE_CONTINUATION"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public L0(Li6/f;J)J
    .locals 6

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :goto_0
    iget v0, p0, Lb6/h$b;->p:I

    .line 7
    .line 8
    const-wide/16 v1, -0x1

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lb6/h$b;->r:Li6/h;

    .line 13
    .line 14
    iget v3, p0, Lb6/h$b;->q:I

    .line 15
    .line 16
    int-to-long v3, v3

    .line 17
    invoke-interface {v0, v3, v4}, Li6/h;->y0(J)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput v0, p0, Lb6/h$b;->q:I

    .line 22
    .line 23
    iget v0, p0, Lb6/h$b;->n:I

    .line 24
    .line 25
    and-int/lit8 v0, v0, 0x4

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    return-wide v1

    .line 30
    :cond_0
    invoke-direct {p0}, Lb6/h$b;->b()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object v3, p0, Lb6/h$b;->r:Li6/h;

    .line 35
    .line 36
    int-to-long v4, v0

    .line 37
    invoke-static {p2, p3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 38
    .line 39
    .line 40
    move-result-wide p2

    .line 41
    invoke-interface {v3, p1, p2, p3}, Li6/C;->L0(Li6/f;J)J

    .line 42
    .line 43
    .line 44
    move-result-wide p1

    .line 45
    cmp-long p3, p1, v1

    .line 46
    .line 47
    if-nez p3, :cond_2

    .line 48
    .line 49
    return-wide v1

    .line 50
    :cond_2
    iget p3, p0, Lb6/h$b;->p:I

    .line 51
    .line 52
    long-to-int v0, p1

    .line 53
    sub-int/2addr p3, v0

    .line 54
    iput p3, p0, Lb6/h$b;->p:I

    .line 55
    .line 56
    return-wide p1
.end method

.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lb6/h$b;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final d(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb6/h$b;->n:I

    .line 2
    .line 3
    return-void
.end method

.method public final e(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb6/h$b;->p:I

    .line 2
    .line 3
    return-void
.end method

.method public final f(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb6/h$b;->m:I

    .line 2
    .line 3
    return-void
.end method

.method public final g(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb6/h$b;->q:I

    .line 2
    .line 3
    return-void
.end method

.method public i()Li6/D;
    .locals 1

    .line 1
    iget-object v0, p0, Lb6/h$b;->r:Li6/h;

    .line 2
    .line 3
    invoke-interface {v0}, Li6/C;->i()Li6/D;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final j(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb6/h$b;->o:I

    .line 2
    .line 3
    return-void
.end method
