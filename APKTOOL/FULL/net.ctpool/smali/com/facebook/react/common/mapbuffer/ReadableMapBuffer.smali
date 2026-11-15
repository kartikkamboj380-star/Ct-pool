.class public final Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/common/mapbuffer/a;


# annotations
.annotation build LR1/a;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$a;,
        Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;
    }
.end annotation


# static fields
.field public static final p:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$a;


# instance fields
.field private final m:Ljava/nio/ByteBuffer;

.field private final mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build LR1/a;
    .end annotation
.end field

.field private final n:I

.field private o:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->p:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$a;

    invoke-static {}, LU1/a;->a()V

    return-void
.end method

.method private constructor <init>(Lcom/facebook/jni/HybridData;)V
    .locals 0
    .annotation build LR1/a;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->mHybridData:Lcom/facebook/jni/HybridData;

    invoke-direct {p0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->importByteBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->m:Ljava/nio/ByteBuffer;

    const/4 p1, 0x0

    iput p1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->n:I

    invoke-direct {p0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->y()V

    return-void
.end method

.method private constructor <init>(Ljava/nio/ByteBuffer;I)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->mHybridData:Lcom/facebook/jni/HybridData;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const-string v0, "apply(...)"

    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->m:Ljava/nio/ByteBuffer;

    iput p2, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->n:I

    invoke-direct {p0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->y()V

    return-void
.end method

.method private final A(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    return p1
.end method

.method private final C(I)J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v0

    return-wide v0
.end method

.method private final D(I)Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->t()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    add-int/2addr v0, p1

    new-instance p1, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    iget-object v1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->m:Ljava/nio/ByteBuffer;

    add-int/lit8 v0, v0, 0x4

    invoke-direct {p1, v1, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;-><init>(Ljava/nio/ByteBuffer;I)V

    return-object p1
.end method

.method private final E(I)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->t()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    add-int/2addr v0, p1

    iget-object p1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    new-array v1, p1, [B

    add-int/lit8 v0, v0, 0x4

    iget-object v2, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->m:Ljava/nio/ByteBuffer;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    new-instance p1, Ljava/lang/String;

    sget-object v0, LF5/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {p1, v1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object p1
.end method

.method private final F(I)S
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p1

    invoke-static {p1}, Li5/s;->e(S)S

    move-result p1

    return p1
.end method

.method public static final synthetic f(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->r(I)I

    move-result p0

    return p0
.end method

.method public static final synthetic h(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->v(I)Z

    move-result p0

    return p0
.end method

.method public static final synthetic i(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)D
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->x(I)D

    move-result-wide p0

    return-wide p0
.end method

.method private final native importByteBuffer()Ljava/nio/ByteBuffer;
.end method

.method public static final synthetic k(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->A(I)I

    move-result p0

    return p0
.end method

.method public static final synthetic m(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)J
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->C(I)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic n(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->D(I)Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->E(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)S
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->F(I)S

    move-result p0

    return p0
.end method

.method private final q(I)I
    .locals 7

    .line 1
    sget-object v0, Lcom/facebook/react/common/mapbuffer/a;->c:Lcom/facebook/react/common/mapbuffer/a$a;

    invoke-virtual {v0}, Lcom/facebook/react/common/mapbuffer/a$a;->a()LC5/c;

    move-result-object v0

    invoke-virtual {v0}, LC5/a;->f()I

    move-result v1

    invoke-virtual {v0}, LC5/a;->h()I

    move-result v0

    const/4 v2, -0x1

    if-gt p1, v0, :cond_2

    if-gt v1, p1, :cond_2

    int-to-short p1, p1

    invoke-static {p1}, Li5/s;->e(S)S

    move-result p1

    invoke-virtual {p0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-gt v1, v0, :cond_2

    add-int v3, v1, v0

    ushr-int/lit8 v3, v3, 0x1

    invoke-direct {p0, v3}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->r(I)I

    move-result v4

    invoke-direct {p0, v4}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->F(I)S

    move-result v4

    const v5, 0xffff

    and-int/2addr v4, v5

    and-int/2addr v5, p1

    invoke-static {v4, v5}, Lw5/k;->g(II)I

    move-result v6

    if-gez v6, :cond_0

    add-int/lit8 v1, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v4, v5}, Lw5/k;->g(II)I

    move-result v0

    if-lez v0, :cond_1

    add-int/lit8 v0, v3, -0x1

    goto :goto_0

    :cond_1
    return v3

    :cond_2
    return v2
.end method

.method private final r(I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->n:I

    add-int/lit8 v0, v0, 0x8

    mul-int/lit8 p1, p1, 0xc

    add-int/2addr v0, p1

    return v0
.end method

.method private final t()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->getCount()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->r(I)I

    move-result v0

    return v0
.end method

.method private final u(ILcom/facebook/react/common/mapbuffer/a$b;)I
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->q(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    invoke-direct {p0, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->w(I)Lcom/facebook/react/common/mapbuffer/a$b;

    move-result-object v1

    if-ne v1, p2, :cond_0

    invoke-direct {p0, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->r(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x4

    return p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " for key: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", found "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " instead."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Key not found: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final v(I)Z
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->A(I)I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final w(I)Lcom/facebook/react/common/mapbuffer/a$b;
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->r(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x2

    invoke-direct {p0, p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->F(I)S

    move-result p1

    const v0, 0xffff

    and-int/2addr p1, v0

    invoke-static {}, Lcom/facebook/react/common/mapbuffer/a$b;->values()[Lcom/facebook/react/common/mapbuffer/a$b;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1
.end method

.method private final x(I)D
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getDouble(I)D

    move-result-wide v0

    return-wide v0
.end method

.method private final y()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    const/16 v1, 0xfe

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->m:Ljava/nio/ByteBuffer;

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->F(I)S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    iput v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->o:I

    return-void
.end method


# virtual methods
.method public bridge synthetic D0(I)Lcom/facebook/react/common/mapbuffer/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->s(I)Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->m:Ljava/nio/ByteBuffer;

    check-cast p1, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    iget-object p1, p1, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->m:Ljava/nio/ByteBuffer;

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-static {v0, p1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getBoolean(I)Z
    .locals 1

    sget-object v0, Lcom/facebook/react/common/mapbuffer/a$b;->m:Lcom/facebook/react/common/mapbuffer/a$b;

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->u(ILcom/facebook/react/common/mapbuffer/a$b;)I

    move-result p1

    invoke-direct {p0, p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->v(I)Z

    move-result p1

    return p1
.end method

.method public getCount()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->o:I

    return v0
.end method

.method public getDouble(I)D
    .locals 2

    sget-object v0, Lcom/facebook/react/common/mapbuffer/a$b;->o:Lcom/facebook/react/common/mapbuffer/a$b;

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->u(ILcom/facebook/react/common/mapbuffer/a$b;)I

    move-result p1

    invoke-direct {p0, p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->x(I)D

    move-result-wide v0

    return-wide v0
.end method

.method public getInt(I)I
    .locals 1

    sget-object v0, Lcom/facebook/react/common/mapbuffer/a$b;->n:Lcom/facebook/react/common/mapbuffer/a$b;

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->u(ILcom/facebook/react/common/mapbuffer/a$b;)I

    move-result p1

    invoke-direct {p0, p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->A(I)I

    move-result p1

    return p1
.end method

.method public getString(I)Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/facebook/react/common/mapbuffer/a$b;->p:Lcom/facebook/react/common/mapbuffer/a$b;

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->u(ILcom/facebook/react/common/mapbuffer/a$b;)I

    move-result p1

    invoke-direct {p0, p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->E(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    iget-object v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hashCode()I

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$c;

    invoke-direct {v0, p0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$c;-><init>(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;)V

    return-object v0
.end method

.method public j0(I)Z
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->q(I)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public s(I)Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/common/mapbuffer/a$b;->q:Lcom/facebook/react/common/mapbuffer/a$b;

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->u(ILcom/facebook/react/common/mapbuffer/a$b;)I

    move-result p1

    invoke-direct {p0, p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->D(I)Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v0, "{"

    invoke-direct {v10, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v7, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$d;->m:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$d;

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, v10

    invoke-static/range {v0 .. v9}, Lj5/n;->M(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lv5/l;ILjava/lang/Object;)Ljava/lang/Appendable;

    const/16 v0, 0x7d

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
