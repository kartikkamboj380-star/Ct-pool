.class public final Ly1/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly1/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public A:I

.field public B:Z

.field public C:Z

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:I

.field public H:Z

.field public I:Z

.field public J:LH1/h;

.field private final a:Ly1/l$a;

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:I

.field public i:I

.field public j:Z

.field public k:I

.field public l:Z

.field public m:Z

.field public n:Ly1/n$d;

.field public o:LO0/o;

.field public p:Z

.field public q:Z

.field public r:LO0/o;

.field public s:Z

.field public t:J

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Ly1/l$a;)V
    .locals 3

    .line 1
    const-string v0, "configBuilder"

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
    iput-object p1, p0, Ly1/n$a;->a:Ly1/l$a;

    .line 10
    .line 11
    const/16 p1, 0x800

    .line 12
    .line 13
    iput p1, p0, Ly1/n$a;->k:I

    .line 14
    .line 15
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-static {p1}, LO0/p;->a(Ljava/lang/Object;)LO0/o;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "of(false)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Ly1/n$a;->r:LO0/o;

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, Ly1/n$a;->w:Z

    .line 30
    .line 31
    iput-boolean p1, p0, Ly1/n$a;->x:Z

    .line 32
    .line 33
    const/16 p1, 0x14

    .line 34
    .line 35
    iput p1, p0, Ly1/n$a;->A:I

    .line 36
    .line 37
    const/16 p1, 0x1e

    .line 38
    .line 39
    iput p1, p0, Ly1/n$a;->G:I

    .line 40
    .line 41
    new-instance p1, LH1/h;

    .line 42
    .line 43
    const/4 v0, 0x3

    .line 44
    const/4 v1, 0x0

    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-direct {p1, v2, v2, v0, v1}, LH1/h;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Ly1/n$a;->J:LH1/h;

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final a()Ly1/n;
    .locals 2

    .line 1
    new-instance v0, Ly1/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ly1/n;-><init>(Ly1/n$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
