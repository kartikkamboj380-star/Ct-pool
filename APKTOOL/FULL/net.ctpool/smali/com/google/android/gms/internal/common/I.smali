.class public final Lcom/google/android/gms/internal/common/I;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/common/z;

.field private final b:Z

.field private final c:Lcom/google/android/gms/internal/common/F;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/common/F;ZLcom/google/android/gms/internal/common/z;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/common/I;->c:Lcom/google/android/gms/internal/common/F;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/common/I;->b:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/common/I;->a:Lcom/google/android/gms/internal/common/z;

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/internal/common/I;)Lcom/google/android/gms/internal/common/z;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/common/I;->a:Lcom/google/android/gms/internal/common/z;

    return-object p0
.end method

.method public static c(Lcom/google/android/gms/internal/common/z;)Lcom/google/android/gms/internal/common/I;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/common/I;

    new-instance v1, Lcom/google/android/gms/internal/common/F;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/common/F;-><init>(Lcom/google/android/gms/internal/common/z;)V

    sget-object p0, Lcom/google/android/gms/internal/common/y;->b:Lcom/google/android/gms/internal/common/z;

    const v2, 0x7fffffff

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, p0, v2}, Lcom/google/android/gms/internal/common/I;-><init>(Lcom/google/android/gms/internal/common/F;ZLcom/google/android/gms/internal/common/z;I)V

    return-object v0
.end method

.method static bridge synthetic e(Lcom/google/android/gms/internal/common/I;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/common/I;->h(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic g(Lcom/google/android/gms/internal/common/I;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/android/gms/internal/common/I;->b:Z

    return p0
.end method

.method private final h(Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/common/E;

    iget-object v1, p0, Lcom/google/android/gms/internal/common/I;->c:Lcom/google/android/gms/internal/common/F;

    invoke-direct {v0, v1, p0, p1}, Lcom/google/android/gms/internal/common/E;-><init>(Lcom/google/android/gms/internal/common/F;Lcom/google/android/gms/internal/common/I;Ljava/lang/CharSequence;)V

    return-object v0
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/internal/common/I;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/common/I;->a:Lcom/google/android/gms/internal/common/z;

    new-instance v1, Lcom/google/android/gms/internal/common/I;

    iget-object v2, p0, Lcom/google/android/gms/internal/common/I;->c:Lcom/google/android/gms/internal/common/F;

    const/4 v3, 0x1

    const v4, 0x7fffffff

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/google/android/gms/internal/common/I;-><init>(Lcom/google/android/gms/internal/common/F;ZLcom/google/android/gms/internal/common/z;I)V

    return-object v1
.end method

.method public final d(Ljava/lang/CharSequence;)Ljava/lang/Iterable;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/common/G;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/common/G;-><init>(Lcom/google/android/gms/internal/common/I;Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method public final f(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/common/I;->h(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
