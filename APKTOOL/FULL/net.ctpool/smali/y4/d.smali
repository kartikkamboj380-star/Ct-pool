.class public final Ly4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly4/d$b;
    }
.end annotation


# static fields
.field private static final e:Lw4/d;

.field private static final f:Lw4/f;

.field private static final g:Lw4/f;

.field private static final h:Ly4/d$b;


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Ljava/util/Map;

.field private c:Lw4/d;

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ly4/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ly4/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ly4/d;->e:Lw4/d;

    .line 7
    .line 8
    new-instance v0, Ly4/b;

    .line 9
    .line 10
    invoke-direct {v0}, Ly4/b;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ly4/d;->f:Lw4/f;

    .line 14
    .line 15
    new-instance v0, Ly4/c;

    .line 16
    .line 17
    invoke-direct {v0}, Ly4/c;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Ly4/d;->g:Lw4/f;

    .line 21
    .line 22
    new-instance v0, Ly4/d$b;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, v1}, Ly4/d$b;-><init>(Ly4/d$a;)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Ly4/d;->h:Ly4/d$b;

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ly4/d;->a:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ly4/d;->b:Ljava/util/Map;

    .line 17
    .line 18
    sget-object v0, Ly4/d;->e:Lw4/d;

    .line 19
    .line 20
    iput-object v0, p0, Ly4/d;->c:Lw4/d;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Ly4/d;->d:Z

    .line 24
    .line 25
    const-class v0, Ljava/lang/String;

    .line 26
    .line 27
    sget-object v1, Ly4/d;->f:Lw4/f;

    .line 28
    .line 29
    invoke-virtual {p0, v0, v1}, Ly4/d;->p(Ljava/lang/Class;Lw4/f;)Ly4/d;

    .line 30
    .line 31
    .line 32
    const-class v0, Ljava/lang/Boolean;

    .line 33
    .line 34
    sget-object v1, Ly4/d;->g:Lw4/f;

    .line 35
    .line 36
    invoke-virtual {p0, v0, v1}, Ly4/d;->p(Ljava/lang/Class;Lw4/f;)Ly4/d;

    .line 37
    .line 38
    .line 39
    const-class v0, Ljava/util/Date;

    .line 40
    .line 41
    sget-object v1, Ly4/d;->h:Ly4/d$b;

    .line 42
    .line 43
    invoke-virtual {p0, v0, v1}, Ly4/d;->p(Ljava/lang/Class;Lw4/f;)Ly4/d;

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static synthetic b(Ljava/lang/Boolean;Lw4/g;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly4/d;->n(Ljava/lang/Boolean;Lw4/g;)V

    return-void
.end method

.method public static synthetic c(Ljava/lang/Object;Lw4/e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly4/d;->l(Ljava/lang/Object;Lw4/e;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/String;Lw4/g;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly4/d;->m(Ljava/lang/String;Lw4/g;)V

    return-void
.end method

.method static synthetic e(Ly4/d;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Ly4/d;->a:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic f(Ly4/d;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Ly4/d;->b:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic g(Ly4/d;)Lw4/d;
    .locals 0

    .line 1
    iget-object p0, p0, Ly4/d;->c:Lw4/d;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic h(Ly4/d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ly4/d;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method private static synthetic l(Ljava/lang/Object;Lw4/e;)V
    .locals 2

    .line 1
    new-instance p1, Lw4/b;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v1, "Couldn\'t find encoder for type "

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {p1, p0}, Lw4/b;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1
.end method

.method private static synthetic m(Ljava/lang/String;Lw4/g;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lw4/g;->f(Ljava/lang/String;)Lw4/g;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static synthetic n(Ljava/lang/Boolean;Lw4/g;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-interface {p1, p0}, Lw4/g;->g(Z)Lw4/g;

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Class;Lw4/d;)Lx4/b;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ly4/d;->o(Ljava/lang/Class;Lw4/d;)Ly4/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public i()Lw4/a;
    .locals 1

    .line 1
    new-instance v0, Ly4/d$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ly4/d$a;-><init>(Ly4/d;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public j(Lx4/a;)Ly4/d;
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lx4/a;->a(Lx4/b;)V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public k(Z)Ly4/d;
    .locals 0

    .line 1
    iput-boolean p1, p0, Ly4/d;->d:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public o(Ljava/lang/Class;Lw4/d;)Ly4/d;
    .locals 1

    .line 1
    iget-object v0, p0, Ly4/d;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Ly4/d;->b:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public p(Ljava/lang/Class;Lw4/f;)Ly4/d;
    .locals 1

    .line 1
    iget-object v0, p0, Ly4/d;->b:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Ly4/d;->a:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
