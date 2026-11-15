.class public final Ls1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls1/d$b;
    }
.end annotation


# static fields
.field public static final d:Ls1/d$b;

.field private static final e:Lkotlin/Lazy;


# instance fields
.field private a:I

.field private b:Ljava/util/List;

.field private final c:Ls1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ls1/d$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ls1/d$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ls1/d;->d:Ls1/d$b;

    .line 8
    .line 9
    sget-object v0, Li5/j;->m:Li5/j;

    .line 10
    .line 11
    sget-object v1, Ls1/d$a;->m:Ls1/d$a;

    .line 12
    .line 13
    invoke-static {v0, v1}, Li5/g;->a(Li5/j;Lv5/a;)Lkotlin/Lazy;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Ls1/d;->e:Lkotlin/Lazy;

    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls1/a;

    invoke-direct {v0}, Ls1/a;-><init>()V

    iput-object v0, p0, Ls1/d;->c:Ls1/a;

    invoke-direct {p0}, Ls1/d;->d()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ls1/d;-><init>()V

    return-void
.end method

.method public static final synthetic a()Lkotlin/Lazy;
    .locals 1

    .line 1
    sget-object v0, Ls1/d;->e:Lkotlin/Lazy;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final c(Ljava/io/InputStream;)Ls1/c;
    .locals 1

    .line 1
    sget-object v0, Ls1/d;->d:Ls1/d$b;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ls1/d$b;->c(Ljava/io/InputStream;)Ls1/c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Ls1/d;->c:Ls1/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls1/a;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput v0, p0, Ls1/d;->a:I

    .line 8
    .line 9
    iget-object v0, p0, Ls1/d;->b:Ljava/util/List;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ls1/c$b;

    .line 31
    .line 32
    iget v2, p0, Ls1/d;->a:I

    .line 33
    .line 34
    invoke-interface {v1}, Ls1/c$b;->a()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iput v1, p0, Ls1/d;->a:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Ljava/io/InputStream;)Ls1/c;
    .locals 4

    .line 1
    const-string v0, "is"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Ls1/d;->a:I

    .line 7
    .line 8
    new-array v1, v0, [B

    .line 9
    .line 10
    sget-object v2, Ls1/d;->d:Ls1/d$b;

    .line 11
    .line 12
    invoke-static {v2, v0, p1, v1}, Ls1/d$b;->a(Ls1/d$b;ILjava/io/InputStream;[B)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object v0, p0, Ls1/d;->c:Ls1/a;

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Ls1/a;->b([BI)Ls1/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v2, Ls1/c;->d:Ls1/c;

    .line 23
    .line 24
    if-eq v0, v2, :cond_0

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_0
    iget-object v0, p0, Ls1/d;->b:Ljava/util/List;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    check-cast v0, Ljava/lang/Iterable;

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Ls1/c$b;

    .line 48
    .line 49
    invoke-interface {v2, v1, p1}, Ls1/c$b;->b([BI)Ls1/c;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    sget-object v3, Ls1/c;->d:Ls1/c;

    .line 54
    .line 55
    if-eq v2, v3, :cond_1

    .line 56
    .line 57
    return-object v2

    .line 58
    :cond_2
    sget-object p1, Ls1/c;->d:Ls1/c;

    .line 59
    .line 60
    return-object p1
.end method
