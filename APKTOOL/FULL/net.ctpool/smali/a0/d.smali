.class public final La0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La0/d$c;,
        La0/d$a;,
        La0/d$b;
    }
.end annotation


# static fields
.field public static final t:La0/d$a;


# instance fields
.field private final m:Landroid/content/Context;

.field private final n:Ljava/lang/String;

.field private final o:LZ/h$a;

.field private final p:Z

.field private final q:Z

.field private final r:Lkotlin/Lazy;

.field private s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La0/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, La0/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La0/d;->t:La0/d$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;LZ/h$a;ZZ)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, La0/d;->m:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p2, p0, La0/d;->n:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p3, p0, La0/d;->o:LZ/h$a;

    .line 19
    .line 20
    iput-boolean p4, p0, La0/d;->p:Z

    .line 21
    .line 22
    iput-boolean p5, p0, La0/d;->q:Z

    .line 23
    .line 24
    new-instance p1, La0/d$d;

    .line 25
    .line 26
    invoke-direct {p1, p0}, La0/d$d;-><init>(La0/d;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Li5/g;->b(Lv5/a;)Lkotlin/Lazy;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, La0/d;->r:Lkotlin/Lazy;

    .line 34
    .line 35
    return-void
.end method

.method public static final synthetic a(La0/d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La0/d;->q:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic b(La0/d;)LZ/h$a;
    .locals 0

    .line 1
    iget-object p0, p0, La0/d;->o:LZ/h$a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(La0/d;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, La0/d;->m:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(La0/d;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La0/d;->n:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(La0/d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La0/d;->p:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic g(La0/d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La0/d;->s:Z

    .line 2
    .line 3
    return p0
.end method

.method private final j()La0/d$c;
    .locals 1

    .line 1
    iget-object v0, p0, La0/d;->r:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La0/d$c;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, La0/d;->r:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, La0/d;->j()La0/d$c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, La0/d$c;->close()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, La0/d;->n:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public l0()LZ/g;
    .locals 2

    .line 1
    invoke-direct {p0}, La0/d;->j()La0/d$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, La0/d$c;->d(Z)LZ/g;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, La0/d;->r:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, La0/d;->j()La0/d$c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0, p1}, LZ/b;->d(Landroid/database/sqlite/SQLiteOpenHelper;Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-boolean p1, p0, La0/d;->s:Z

    .line 17
    .line 18
    return-void
.end method
