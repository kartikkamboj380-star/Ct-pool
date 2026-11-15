.class public final Ly1/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly1/t$a;
    }
.end annotation


# static fields
.field public static final K:Ly1/t$a;


# instance fields
.field private final A:Lkotlin/Lazy;

.field private final B:Lkotlin/Lazy;

.field private final C:Lkotlin/Lazy;

.field private final D:Lkotlin/Lazy;

.field private final E:Lkotlin/Lazy;

.field private final F:Lkotlin/Lazy;

.field private final G:Lkotlin/Lazy;

.field private final H:Lkotlin/Lazy;

.field private final I:Lkotlin/Lazy;

.field private final J:Lkotlin/Lazy;

.field private final a:Landroid/content/ContentResolver;

.field private final b:Ly1/s;

.field private final c:Lcom/facebook/imagepipeline/producers/X;

.field private final d:Z

.field private final e:Z

.field private final f:Lcom/facebook/imagepipeline/producers/p0;

.field private final g:Ly1/e;

.field private final h:Z

.field private final i:Z

.field private final j:Z

.field private final k:LL1/d;

.field private final l:Z

.field private final m:Z

.field private final n:Z

.field private final o:Ljava/util/Set;

.field private p:Ljava/util/Map;

.field private q:Ljava/util/Map;

.field private r:Ljava/util/Map;

.field private final s:Lkotlin/Lazy;

.field private final t:Lkotlin/Lazy;

.field private final u:Lkotlin/Lazy;

.field private final v:Lkotlin/Lazy;

.field private final w:Lkotlin/Lazy;

.field private final x:Lkotlin/Lazy;

.field private final y:Lkotlin/Lazy;

.field private final z:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ly1/t$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ly1/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ly1/t;->K:Ly1/t$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/ContentResolver;Ly1/s;Lcom/facebook/imagepipeline/producers/X;ZZLcom/facebook/imagepipeline/producers/p0;Ly1/e;ZZZLL1/d;ZZZLjava/util/Set;)V
    .locals 8

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p6

    move-object v5, p7

    move-object/from16 v6, p11

    .line 1
    const-string v7, "contentResolver"

    invoke-static {p1, v7}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "producerFactory"

    invoke-static {p2, v7}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "networkFetcher"

    invoke-static {p3, v7}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "threadHandoffProducerQueue"

    invoke-static {p6, v7}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "downsampleMode"

    invoke-static {p7, v7}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "imageTranscoderFactory"

    invoke-static {v6, v7}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Ly1/t;->a:Landroid/content/ContentResolver;

    iput-object v2, v0, Ly1/t;->b:Ly1/s;

    iput-object v3, v0, Ly1/t;->c:Lcom/facebook/imagepipeline/producers/X;

    move v1, p4

    iput-boolean v1, v0, Ly1/t;->d:Z

    move v1, p5

    iput-boolean v1, v0, Ly1/t;->e:Z

    iput-object v4, v0, Ly1/t;->f:Lcom/facebook/imagepipeline/producers/p0;

    iput-object v5, v0, Ly1/t;->g:Ly1/e;

    move/from16 v1, p8

    iput-boolean v1, v0, Ly1/t;->h:Z

    move/from16 v1, p9

    iput-boolean v1, v0, Ly1/t;->i:Z

    move/from16 v1, p10

    iput-boolean v1, v0, Ly1/t;->j:Z

    iput-object v6, v0, Ly1/t;->k:LL1/d;

    move/from16 v1, p12

    iput-boolean v1, v0, Ly1/t;->l:Z

    move/from16 v1, p13

    iput-boolean v1, v0, Ly1/t;->m:Z

    move/from16 v1, p14

    iput-boolean v1, v0, Ly1/t;->n:Z

    move-object/from16 v1, p15

    iput-object v1, v0, Ly1/t;->o:Ljava/util/Set;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, v0, Ly1/t;->p:Ljava/util/Map;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, v0, Ly1/t;->q:Ljava/util/Map;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, v0, Ly1/t;->r:Ljava/util/Map;

    new-instance v1, Ly1/t$p;

    invoke-direct {v1, p0}, Ly1/t$p;-><init>(Ly1/t;)V

    invoke-static {v1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Ly1/t;->s:Lkotlin/Lazy;

    new-instance v1, Ly1/t$j;

    invoke-direct {v1, p0}, Ly1/t$j;-><init>(Ly1/t;)V

    invoke-static {v1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Ly1/t;->t:Lkotlin/Lazy;

    new-instance v1, Ly1/t$h;

    invoke-direct {v1, p0}, Ly1/t$h;-><init>(Ly1/t;)V

    invoke-static {v1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Ly1/t;->u:Lkotlin/Lazy;

    new-instance v1, Ly1/t$q;

    invoke-direct {v1, p0}, Ly1/t$q;-><init>(Ly1/t;)V

    invoke-static {v1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Ly1/t;->v:Lkotlin/Lazy;

    new-instance v1, Ly1/t$d;

    invoke-direct {v1, p0}, Ly1/t$d;-><init>(Ly1/t;)V

    invoke-static {v1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Ly1/t;->w:Lkotlin/Lazy;

    new-instance v1, Ly1/t$r;

    invoke-direct {v1, p0}, Ly1/t$r;-><init>(Ly1/t;)V

    invoke-static {v1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Ly1/t;->x:Lkotlin/Lazy;

    new-instance v1, Ly1/t$e;

    invoke-direct {v1, p0}, Ly1/t$e;-><init>(Ly1/t;)V

    invoke-static {v1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Ly1/t;->y:Lkotlin/Lazy;

    new-instance v1, Ly1/t$k;

    invoke-direct {v1, p0}, Ly1/t$k;-><init>(Ly1/t;)V

    invoke-static {v1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Ly1/t;->z:Lkotlin/Lazy;

    new-instance v1, Ly1/t$c;

    invoke-direct {v1, p0}, Ly1/t$c;-><init>(Ly1/t;)V

    invoke-static {v1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Ly1/t;->A:Lkotlin/Lazy;

    new-instance v1, Ly1/t$b;

    invoke-direct {v1, p0}, Ly1/t$b;-><init>(Ly1/t;)V

    invoke-static {v1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Ly1/t;->B:Lkotlin/Lazy;

    new-instance v1, Ly1/t$l;

    invoke-direct {v1, p0}, Ly1/t$l;-><init>(Ly1/t;)V

    invoke-static {v1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Ly1/t;->C:Lkotlin/Lazy;

    new-instance v1, Ly1/t$o;

    invoke-direct {v1, p0}, Ly1/t$o;-><init>(Ly1/t;)V

    invoke-static {v1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Ly1/t;->D:Lkotlin/Lazy;

    new-instance v1, Ly1/t$i;

    invoke-direct {v1, p0}, Ly1/t$i;-><init>(Ly1/t;)V

    invoke-static {v1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Ly1/t;->E:Lkotlin/Lazy;

    new-instance v1, Ly1/t$n;

    invoke-direct {v1, p0}, Ly1/t$n;-><init>(Ly1/t;)V

    invoke-static {v1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Ly1/t;->F:Lkotlin/Lazy;

    new-instance v1, Ly1/t$s;

    invoke-direct {v1, p0}, Ly1/t$s;-><init>(Ly1/t;)V

    invoke-static {v1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Ly1/t;->G:Lkotlin/Lazy;

    new-instance v1, Ly1/t$m;

    invoke-direct {v1, p0}, Ly1/t$m;-><init>(Ly1/t;)V

    invoke-static {v1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Ly1/t;->H:Lkotlin/Lazy;

    new-instance v1, Ly1/t$g;

    invoke-direct {v1, p0}, Ly1/t$g;-><init>(Ly1/t;)V

    invoke-static {v1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Ly1/t;->I:Lkotlin/Lazy;

    new-instance v1, Ly1/t$f;

    invoke-direct {v1, p0}, Ly1/t$f;-><init>(Ly1/t;)V

    invoke-static {v1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Ly1/t;->J:Lkotlin/Lazy;

    return-void
.end method

.method private final declared-synchronized B(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ly1/t;->p:Ljava/util/Map;

    .line 3
    .line 4
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ly1/s;->B(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/b0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "producerFactory.newPostp\u2026orProducer(inputProducer)"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Ly1/t;->b:Ly1/s;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ly1/s;->A(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/a0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Ly1/t;->p:Ljava/util/Map;

    .line 30
    .line 31
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    monitor-exit p0

    .line 38
    return-object v0

    .line 39
    :goto_1
    monitor-exit p0

    .line 40
    throw p1
.end method

.method private final D(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ly1/s;->e(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/i;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "producerFactory.newBitma\u2026heProducer(inputProducer)"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ly1/s;->d(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/h;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "producerFactory.newBitma\u2026itmapMemoryCacheProducer)"

    .line 19
    .line 20
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 24
    .line 25
    iget-object v1, p0, Ly1/t;->f:Lcom/facebook/imagepipeline/producers/p0;

    .line 26
    .line 27
    invoke-virtual {v0, p1, v1}, Ly1/s;->b(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/p0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v0, "producerFactory.newBackg\u2026readHandoffProducerQueue)"

    .line 32
    .line 33
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-boolean v0, p0, Ly1/t;->l:Z

    .line 37
    .line 38
    const-string v1, "producerFactory.newBitma\u2026er(threadHandoffProducer)"

    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    iget-boolean v0, p0, Ly1/t;->m:Z

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ly1/s;->c(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/g;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object p1

    .line 57
    :cond_1
    :goto_0
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Ly1/s;->c(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/g;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 67
    .line 68
    invoke-virtual {v0, p1}, Ly1/s;->g(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/k;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const-string v0, "producerFactory.newBitma\u2026apMemoryCacheGetProducer)"

    .line 73
    .line 74
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object p1
.end method

.method private final F(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 3

    .line 1
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly1/s;->t()Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "producerFactory.newLocalExifThumbnailProducer()"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    new-array v1, v1, [Lcom/facebook/imagepipeline/producers/u0;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    aput-object v0, v1, v2

    .line 17
    .line 18
    invoke-direct {p0, p1, v1}, Ly1/t;->G(Lcom/facebook/imagepipeline/producers/d0;[Lcom/facebook/imagepipeline/producers/u0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method private final G(Lcom/facebook/imagepipeline/producers/d0;[Lcom/facebook/imagepipeline/producers/u0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ly1/t;->J(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1, p2}, Ly1/t;->L(Lcom/facebook/imagepipeline/producers/d0;[Lcom/facebook/imagepipeline/producers/u0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Ly1/t;->E(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method private final I(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 4

    .line 1
    invoke-static {}, LK1/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "producerFactory.newDiskC\u2026ducer(cacheWriteProducer)"

    .line 6
    .line 7
    const-string v2, "if (partialImageCachingE\u2026utProducer)\n            }"

    .line 8
    .line 9
    const-string v3, "producerFactory.newParti\u2026heProducer(inputProducer)"

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-boolean v0, p0, Ly1/t;->i:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ly1/s;->z(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/Y;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1, v3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ly1/s;->m(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/x;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ly1/s;->l(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/v;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_1
    const-string v0, "ProducerSequenceFactory#newDiskCacheSequence"

    .line 46
    .line 47
    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :try_start_0
    iget-boolean v0, p0, Ly1/t;->i:Z

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ly1/s;->z(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/Y;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1, v3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 64
    .line 65
    :goto_0
    invoke-virtual {v0, p1}, Ly1/s;->m(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/x;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    goto :goto_1

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :goto_1
    invoke-static {p1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 79
    .line 80
    invoke-virtual {v0, p1}, Ly1/s;->l(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/v;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    invoke-static {}, LK1/b;->b()V

    .line 88
    .line 89
    .line 90
    return-object p1

    .line 91
    :goto_2
    invoke-static {}, LK1/b;->b()V

    .line 92
    .line 93
    .line 94
    throw p1
.end method

.method private final J(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    iget-boolean v0, p0, Ly1/t;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ly1/t;->I(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ly1/s;->o(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "producerFactory.newEncodedMemoryCacheProducer(ip)"

    .line 16
    .line 17
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-boolean v0, p0, Ly1/t;->m:Z

    .line 21
    .line 22
    const-string v1, "producerFactory.newEncod\u2026codedMemoryCacheProducer)"

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ly1/s;->p(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/A;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ly1/s;->n(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/y;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v0, "producerFactory.newEncod\u2026exProducer(probeProducer)"

    .line 42
    .line 43
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_1
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ly1/s;->n(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/y;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object p1
.end method

.method private final K([Lcom/facebook/imagepipeline/producers/u0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 3

    .line 1
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ly1/s;->G([Lcom/facebook/imagepipeline/producers/u0;)Lcom/facebook/imagepipeline/producers/t0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "producerFactory.newThumb\u2026ducer(thumbnailProducers)"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iget-object v2, p0, Ly1/t;->k:LL1/d;

    .line 16
    .line 17
    invoke-virtual {v0, p1, v1, v2}, Ly1/s;->D(Lcom/facebook/imagepipeline/producers/d0;ZLL1/d;)Lcom/facebook/imagepipeline/producers/k0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "producerFactory.newResiz\u2026, imageTranscoderFactory)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method private final L(Lcom/facebook/imagepipeline/producers/d0;[Lcom/facebook/imagepipeline/producers/u0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 3

    .line 1
    invoke-static {p1}, Ly1/s;->a(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "newAddImageTransformMeta\u2026taProducer(inputProducer)"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    iget-object v2, p0, Ly1/t;->k:LL1/d;

    .line 14
    .line 15
    invoke-virtual {v0, p1, v1, v2}, Ly1/s;->D(Lcom/facebook/imagepipeline/producers/d0;ZLL1/d;)Lcom/facebook/imagepipeline/producers/k0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v0, "producerFactory.newResiz\u2026, imageTranscoderFactory)"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ly1/s;->F(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/r0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v0, "producerFactory.newThrot\u2026ducer(localImageProducer)"

    .line 31
    .line 32
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, p2}, Ly1/t;->K([Lcom/facebook/imagepipeline/producers/u0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-static {p2, p1}, Ly1/s;->h(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/m;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string p2, "newBranchOnSeparateImage\u2026lImageThrottlingProducer)"

    .line 44
    .line 45
    invoke-static {p1, p2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object p1
.end method

.method public static final synthetic a(Ly1/t;)LL1/d;
    .locals 0

    .line 1
    iget-object p0, p0, Ly1/t;->k:LL1/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Ly1/t;)Lcom/facebook/imagepipeline/producers/X;
    .locals 0

    .line 1
    iget-object p0, p0, Ly1/t;->c:Lcom/facebook/imagepipeline/producers/X;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Ly1/t;)Ly1/s;
    .locals 0

    .line 1
    iget-object p0, p0, Ly1/t;->b:Ly1/s;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Ly1/t;)Lcom/facebook/imagepipeline/producers/p0;
    .locals 0

    .line 1
    iget-object p0, p0, Ly1/t;->f:Lcom/facebook/imagepipeline/producers/p0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(Ly1/t;Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ly1/t;->D(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic f(Ly1/t;Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ly1/t;->F(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic g(Ly1/t;Lcom/facebook/imagepipeline/producers/d0;[Lcom/facebook/imagepipeline/producers/u0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ly1/t;->G(Lcom/facebook/imagepipeline/producers/d0;[Lcom/facebook/imagepipeline/producers/u0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic h(Ly1/t;Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ly1/t;->J(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final l(LJ1/b;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 5

    .line 1
    invoke-static {}, LK1/b;->d()Z

    move-result v0

    const-string v1, "Unsupported uri scheme! Uri is: "

    const/4 v2, 0x0

    const-string v3, "Uri is null."

    const-string v4, "imageRequest.sourceUri"

    if-nez v0, :cond_7

    invoke-virtual {p1}, LJ1/b;->u()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0, v4}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_6

    invoke-virtual {p1}, LJ1/b;->v()I

    move-result v3

    if-eqz v3, :cond_5

    packed-switch v3, :pswitch_data_0

    iget-object p1, p0, Ly1/t;->o:Ljava/util/Set;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    throw v2

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    sget-object v2, Ly1/t;->K:Ly1/t$a;

    invoke-static {v2, v0}, Ly1/t$a;->a(Ly1/t$a;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-virtual {p0}, Ly1/t;->C()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {p0}, Ly1/t;->o()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_2
    invoke-virtual {p0}, Ly1/t;->w()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_3
    invoke-virtual {p0}, Ly1/t;->s()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_4
    invoke-virtual {p1}, LJ1/b;->h()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ly1/t;->x()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p0, Ly1/t;->a:Landroid/content/ContentResolver;

    invoke-virtual {p1, v0}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LQ0/a;->c(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ly1/t;->y()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p0}, Ly1/t;->t()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_5
    invoke-virtual {p1}, LJ1/b;->h()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Ly1/t;->x()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {p0}, Ly1/t;->v()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    goto/16 :goto_1

    :pswitch_6
    invoke-virtual {p1}, LJ1/b;->h()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Ly1/t;->x()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-virtual {p0}, Ly1/t;->y()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    goto/16 :goto_1

    :cond_5
    invoke-virtual {p0}, Ly1/t;->z()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    goto/16 :goto_1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    const-string v0, "ProducerSequenceFactory#getBasicDecodedImageSequence"

    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, LJ1/b;->u()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0, v4}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_e

    invoke-virtual {p1}, LJ1/b;->v()I

    move-result v3

    if-eqz v3, :cond_d

    packed-switch v3, :pswitch_data_1

    iget-object p1, p0, Ly1/t;->o:Ljava/util/Set;

    if-eqz p1, :cond_8

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    throw v2

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    sget-object v2, Ly1/t;->K:Ly1/t$a;

    invoke-static {v2, v0}, Ly1/t$a;->a(Ly1/t$a;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_7
    invoke-virtual {p0}, Ly1/t;->C()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    goto :goto_0

    :pswitch_8
    invoke-virtual {p0}, Ly1/t;->o()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    goto :goto_0

    :pswitch_9
    invoke-virtual {p0}, Ly1/t;->w()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    goto :goto_0

    :pswitch_a
    invoke-virtual {p0}, Ly1/t;->s()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    goto :goto_0

    :pswitch_b
    invoke-virtual {p1}, LJ1/b;->h()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {p0}, Ly1/t;->x()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, LK1/b;->b()V

    return-object p1

    :cond_9
    :try_start_1
    iget-object p1, p0, Ly1/t;->a:Landroid/content/ContentResolver;

    invoke-virtual {p1, v0}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LQ0/a;->c(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-virtual {p0}, Ly1/t;->y()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {}, LK1/b;->b()V

    return-object p1

    :cond_a
    :try_start_2
    invoke-virtual {p0}, Ly1/t;->t()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    goto :goto_0

    :pswitch_c
    invoke-virtual {p1}, LJ1/b;->h()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Ly1/t;->x()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {}, LK1/b;->b()V

    return-object p1

    :cond_b
    :try_start_3
    invoke-virtual {p0}, Ly1/t;->v()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    goto :goto_0

    :pswitch_d
    invoke-virtual {p1}, LJ1/b;->h()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {p0}, Ly1/t;->x()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {}, LK1/b;->b()V

    return-object p1

    :cond_c
    :try_start_4
    invoke-virtual {p0}, Ly1/t;->y()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1

    goto :goto_0

    :cond_d
    invoke-virtual {p0}, Ly1/t;->z()Lcom/facebook/imagepipeline/producers/d0;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_0
    invoke-static {}, LK1/b;->b()V

    :goto_1
    return-object p1

    :cond_e
    :try_start_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_2
    invoke-static {}, LK1/b;->b()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch
.end method

.method private final declared-synchronized m(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ly1/t;->r:Ljava/util/Map;

    .line 3
    .line 4
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ly1/s;->f(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/j;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Ly1/t;->r:Ljava/util/Map;

    .line 19
    .line 20
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    monitor-exit p0

    .line 27
    return-object v0

    .line 28
    :goto_1
    monitor-exit p0

    .line 29
    throw p1
.end method

.method private final declared-synchronized q(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ly1/s;->k(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/s;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const-string v0, "producerFactory.newDelayProducer(inputProducer)"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    monitor-exit p0

    .line 14
    return-object p1

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    monitor-exit p0

    .line 17
    throw p1
.end method


# virtual methods
.method public final A()Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/t;->x:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "<get-networkFetchToEncod\u2026oryPrefetchSequence>(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 13
    .line 14
    return-object v0
.end method

.method public final C()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->G:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final E(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    const-string v0, "inputProducer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LK1/b;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const-string v1, "producerFactory.newDecodeProducer(inputProducer)"

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ly1/s;->j(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/p;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p1}, Ly1/t;->D(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_0
    const-string v0, "ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence"

    .line 29
    .line 30
    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :try_start_0
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ly1/s;->j(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/p;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, p1}, Ly1/t;->D(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 43
    .line 44
    .line 45
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    invoke-static {}, LK1/b;->b()V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    invoke-static {}, LK1/b;->b()V

    .line 52
    .line 53
    .line 54
    throw p1
.end method

.method public final declared-synchronized H(Lcom/facebook/imagepipeline/producers/X;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "networkFetcher"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "ProducerSequenceFactory#createCommonNetworkFetchToEncodedMemorySequence"

    .line 8
    .line 9
    invoke-static {}, LK1/b;->d()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ly1/s;->y(Lcom/facebook/imagepipeline/producers/X;)Lcom/facebook/imagepipeline/producers/d0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, "producerFactory.newNetwo\u2026hProducer(networkFetcher)"

    .line 24
    .line 25
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, p1}, Ly1/t;->J(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Ly1/s;->a(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/b;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string v0, "newAddImageTransformMeta\u2026taProducer(inputProducer)"

    .line 37
    .line 38
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 42
    .line 43
    iget-boolean v1, p0, Ly1/t;->d:Z

    .line 44
    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    iget-object v1, p0, Ly1/t;->g:Ly1/e;

    .line 48
    .line 49
    sget-object v4, Ly1/e;->o:Ly1/e;

    .line 50
    .line 51
    if-eq v1, v4, :cond_0

    .line 52
    .line 53
    move v2, v3

    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_3

    .line 57
    :cond_0
    :goto_0
    iget-object v1, p0, Ly1/t;->k:LL1/d;

    .line 58
    .line 59
    invoke-virtual {v0, p1, v2, v1}, Ly1/s;->D(Lcom/facebook/imagepipeline/producers/d0;ZLL1/d;)Lcom/facebook/imagepipeline/producers/k0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const-string v0, "producerFactory.newResiz\u2026  imageTranscoderFactory)"

    .line 64
    .line 65
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v0, "networkFetchToEncodedMemorySequence"

    .line 69
    .line 70
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    monitor-exit p0

    .line 74
    return-object p1

    .line 75
    :cond_1
    :try_start_1
    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    .line 77
    .line 78
    :try_start_2
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 79
    .line 80
    invoke-virtual {v0, p1}, Ly1/s;->y(Lcom/facebook/imagepipeline/producers/X;)Lcom/facebook/imagepipeline/producers/d0;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const-string v0, "producerFactory.newNetwo\u2026hProducer(networkFetcher)"

    .line 85
    .line 86
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-direct {p0, p1}, Ly1/t;->J(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1}, Ly1/s;->a(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/b;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    const-string v0, "newAddImageTransformMeta\u2026taProducer(inputProducer)"

    .line 98
    .line 99
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, Ly1/t;->b:Ly1/s;

    .line 103
    .line 104
    iget-boolean v1, p0, Ly1/t;->d:Z

    .line 105
    .line 106
    if-eqz v1, :cond_2

    .line 107
    .line 108
    iget-object v1, p0, Ly1/t;->g:Ly1/e;

    .line 109
    .line 110
    sget-object v4, Ly1/e;->o:Ly1/e;

    .line 111
    .line 112
    if-eq v1, v4, :cond_2

    .line 113
    .line 114
    move v2, v3

    .line 115
    goto :goto_1

    .line 116
    :catchall_1
    move-exception p1

    .line 117
    goto :goto_2

    .line 118
    :cond_2
    :goto_1
    iget-object v1, p0, Ly1/t;->k:LL1/d;

    .line 119
    .line 120
    invoke-virtual {v0, p1, v2, v1}, Ly1/s;->D(Lcom/facebook/imagepipeline/producers/d0;ZLL1/d;)Lcom/facebook/imagepipeline/producers/k0;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    const-string v0, "producerFactory.newResiz\u2026  imageTranscoderFactory)"

    .line 125
    .line 126
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    const-string v0, "networkFetchToEncodedMemorySequence"

    .line 130
    .line 131
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 132
    .line 133
    .line 134
    :try_start_3
    invoke-static {}, LK1/b;->b()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 135
    .line 136
    .line 137
    monitor-exit p0

    .line 138
    return-object p1

    .line 139
    :goto_2
    :try_start_4
    invoke-static {}, LK1/b;->b()V

    .line 140
    .line 141
    .line 142
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 143
    :goto_3
    monitor-exit p0

    .line 144
    throw p1
.end method

.method public final i()Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/t;->B:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "<get-backgroundLocalCont\u2026ncodeMemorySequence>(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 13
    .line 14
    return-object v0
.end method

.method public final j()Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/t;->A:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "<get-backgroundLocalFile\u2026ncodeMemorySequence>(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 13
    .line 14
    return-object v0
.end method

.method public final k()Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/t;->w:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "<get-backgroundNetworkFe\u2026codedMemorySequence>(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 13
    .line 14
    return-object v0
.end method

.method public final n()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->y:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final o()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->J:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final p(LJ1/b;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    const-string v0, "imageRequest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LK1/b;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    invoke-direct {p0, p1}, Ly1/t;->l(LJ1/b;)Lcom/facebook/imagepipeline/producers/d0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1}, LJ1/b;->k()LJ1/d;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-direct {p0, v0}, Ly1/t;->B(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    iget-boolean v1, p0, Ly1/t;->h:Z

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-direct {p0, v0}, Ly1/t;->m(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_1
    iget-boolean v1, p0, Ly1/t;->n:Z

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1}, LJ1/b;->e()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-lez p1, :cond_2

    .line 43
    .line 44
    invoke-direct {p0, v0}, Ly1/t;->q(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_2
    return-object v0

    .line 49
    :cond_3
    const-string v0, "ProducerSequenceFactory#getDecodedImageProducerSequence"

    .line 50
    .line 51
    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :try_start_0
    invoke-direct {p0, p1}, Ly1/t;->l(LJ1/b;)Lcom/facebook/imagepipeline/producers/d0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p1}, LJ1/b;->k()LJ1/d;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    invoke-direct {p0, v0}, Ly1/t;->B(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    goto :goto_1

    .line 71
    :cond_4
    :goto_0
    iget-boolean v1, p0, Ly1/t;->h:Z

    .line 72
    .line 73
    if-eqz v1, :cond_5

    .line 74
    .line 75
    invoke-direct {p0, v0}, Ly1/t;->m(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    :cond_5
    iget-boolean v1, p0, Ly1/t;->n:Z

    .line 80
    .line 81
    if-eqz v1, :cond_6

    .line 82
    .line 83
    invoke-virtual {p1}, LJ1/b;->e()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-lez p1, :cond_6

    .line 88
    .line 89
    invoke-direct {p0, v0}, Ly1/t;->q(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 90
    .line 91
    .line 92
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    :cond_6
    invoke-static {}, LK1/b;->b()V

    .line 94
    .line 95
    .line 96
    return-object v0

    .line 97
    :goto_1
    invoke-static {}, LK1/b;->b()V

    .line 98
    .line 99
    .line 100
    throw p1
.end method

.method public final r(LJ1/b;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 3

    .line 1
    const-string v0, "imageRequest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ly1/t;->K:Ly1/t$a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Ly1/t$a;->b(Ly1/t$a;LJ1/b;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, LJ1/b;->v()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    if-eq v1, v2, :cond_1

    .line 19
    .line 20
    const/4 v2, 0x3

    .line 21
    if-ne v1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p1}, LJ1/b;->u()Landroid/net/Uri;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v1, "imageRequest.sourceUri"

    .line 29
    .line 30
    invoke-static {p1, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    invoke-static {v0, p1}, Ly1/t$a;->a(Ly1/t$a;Landroid/net/Uri;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v2, "Unsupported uri scheme for encoded image fetch! Uri is: "

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v1

    .line 60
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ly1/t;->u()Lcom/facebook/imagepipeline/producers/d0;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    invoke-virtual {p0}, Ly1/t;->A()Lcom/facebook/imagepipeline/producers/d0;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :goto_1
    return-object p1
.end method

.method public final s()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->I:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final t()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->E:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final u()Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/t;->z:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "<get-localFileFetchToEnc\u2026oryPrefetchSequence>(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 13
    .line 14
    return-object v0
.end method

.method public final v()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->C:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final w()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->H:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final x()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->F:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final y()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->D:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final z()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/t;->v:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/imagepipeline/producers/d0;

    .line 8
    .line 9
    return-object v0
.end method
