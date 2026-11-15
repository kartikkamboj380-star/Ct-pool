.class public LJ0/g$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ0/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:LO0/o;

.field private d:J

.field private e:J

.field private f:J

.field private g:LJ0/m;

.field private h:LI0/a;

.field private i:LI0/c;

.field private j:LL0/b;

.field private k:Z

.field private final l:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, LJ0/g$b;->a:I

    const-string v0, "image_cache"

    iput-object v0, p0, LJ0/g$b;->b:Ljava/lang/String;

    const-wide/32 v0, 0x2800000

    iput-wide v0, p0, LJ0/g$b;->d:J

    const-wide/32 v0, 0xa00000

    iput-wide v0, p0, LJ0/g$b;->e:J

    const-wide/32 v0, 0x200000

    iput-wide v0, p0, LJ0/g$b;->f:J

    new-instance v0, LJ0/f;

    invoke-direct {v0}, LJ0/f;-><init>()V

    iput-object v0, p0, LJ0/g$b;->g:LJ0/m;

    iput-object p1, p0, LJ0/g$b;->l:Landroid/content/Context;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;LJ0/h;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LJ0/g$b;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method static bridge synthetic a(LJ0/g$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, LJ0/g$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic b(LJ0/g$b;)LO0/o;
    .locals 0

    .line 1
    iget-object p0, p0, LJ0/g$b;->c:LO0/o;

    return-object p0
.end method

.method static bridge synthetic c(LJ0/g$b;)LI0/a;
    .locals 0

    .line 1
    iget-object p0, p0, LJ0/g$b;->h:LI0/a;

    return-object p0
.end method

.method static bridge synthetic d(LJ0/g$b;)LI0/c;
    .locals 0

    .line 1
    iget-object p0, p0, LJ0/g$b;->i:LI0/c;

    return-object p0
.end method

.method static bridge synthetic e(LJ0/g$b;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, LJ0/g$b;->l:Landroid/content/Context;

    return-object p0
.end method

.method static bridge synthetic f(LJ0/g$b;)LL0/b;
    .locals 0

    .line 1
    iget-object p0, p0, LJ0/g$b;->j:LL0/b;

    return-object p0
.end method

.method static bridge synthetic g(LJ0/g$b;)LJ0/m;
    .locals 0

    .line 1
    iget-object p0, p0, LJ0/g$b;->g:LJ0/m;

    return-object p0
.end method

.method static bridge synthetic h(LJ0/g$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LJ0/g$b;->k:Z

    return p0
.end method

.method static bridge synthetic i(LJ0/g$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LJ0/g$b;->d:J

    return-wide v0
.end method

.method static bridge synthetic j(LJ0/g$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LJ0/g$b;->e:J

    return-wide v0
.end method

.method static bridge synthetic k(LJ0/g$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LJ0/g$b;->f:J

    return-wide v0
.end method

.method static bridge synthetic l(LJ0/g$b;)I
    .locals 0

    .line 1
    iget p0, p0, LJ0/g$b;->a:I

    return p0
.end method

.method static bridge synthetic m(LJ0/g$b;LO0/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, LJ0/g$b;->c:LO0/o;

    return-void
.end method


# virtual methods
.method public n()LJ0/g;
    .locals 1

    .line 1
    new-instance v0, LJ0/g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LJ0/g;-><init>(LJ0/g$b;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
