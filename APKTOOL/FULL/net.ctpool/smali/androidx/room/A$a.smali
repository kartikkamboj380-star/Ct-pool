.class final Landroidx/room/A$a;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/A;-><init>(Landroidx/room/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:Landroidx/room/A;


# direct methods
.method constructor <init>(Landroidx/room/A;)V
    .locals 0

    iput-object p1, p0, Landroidx/room/A$a;->m:Landroidx/room/A;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LZ/k;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/A$a;->m:Landroidx/room/A;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/room/A;->access$createNewStatement(Landroidx/room/A;)LZ/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/room/A$a;->a()LZ/k;

    move-result-object v0

    return-object v0
.end method
