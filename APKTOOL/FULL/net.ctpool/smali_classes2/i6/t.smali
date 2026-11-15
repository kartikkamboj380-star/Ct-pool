.class public final Li6/t;
.super Lj5/b;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li6/t$a;
    }
.end annotation


# static fields
.field public static final p:Li6/t$a;


# instance fields
.field private final n:[Li6/i;

.field private final o:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li6/t$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Li6/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Li6/t;->p:Li6/t$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>([Li6/i;[I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lj5/b;-><init>()V

    iput-object p1, p0, Li6/t;->n:[Li6/i;

    iput-object p2, p0, Li6/t;->o:[I

    return-void
.end method

.method public synthetic constructor <init>([Li6/i;[ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Li6/t;-><init>([Li6/i;[I)V

    return-void
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Li6/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Li6/i;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Li6/t;->h(Li6/i;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
.end method

.method public f()I
    .locals 1

    .line 1
    iget-object v0, p0, Li6/t;->n:[Li6/i;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    return v0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li6/t;->i(I)Li6/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge h(Li6/i;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lj5/a;->contains(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public i(I)Li6/i;
    .locals 1

    .line 1
    iget-object v0, p0, Li6/t;->n:[Li6/i;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Li6/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Li6/i;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Li6/t;->n(Li6/i;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, -0x1

    .line 13
    return p1
.end method

.method public final k()[Li6/i;
    .locals 1

    .line 1
    iget-object v0, p0, Li6/t;->n:[Li6/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Li6/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Li6/i;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Li6/t;->o(Li6/i;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, -0x1

    .line 13
    return p1
.end method

.method public final m()[I
    .locals 1

    .line 1
    iget-object v0, p0, Li6/t;->o:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge n(Li6/i;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lj5/b;->indexOf(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public bridge o(Li6/i;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lj5/b;->lastIndexOf(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method
