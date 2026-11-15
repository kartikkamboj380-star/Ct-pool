.class Lq0/s$a;
.super Landroidx/room/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq0/s;-><init>(Landroidx/room/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lq0/s;


# direct methods
.method constructor <init>(Lq0/s;Landroidx/room/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq0/s$a;->a:Lq0/s;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroidx/room/i;-><init>(Landroidx/room/u;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic bind(LZ/k;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p2}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/4 p2, 0x0

    .line 5
    invoke-virtual {p0, p1, p2}, Lq0/s$a;->d(LZ/k;Lq0/q;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)"

    .line 2
    .line 3
    return-object v0
.end method

.method public d(LZ/k;Lq0/q;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    throw p1
.end method
