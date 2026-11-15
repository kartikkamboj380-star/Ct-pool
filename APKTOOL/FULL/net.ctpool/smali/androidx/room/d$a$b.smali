.class final Landroidx/room/d$a$b;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/d$a;->u(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Landroidx/room/d$a$b;->m:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LZ/g;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "db"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/room/d$a$b;->m:Ljava/lang/String;

    .line 7
    .line 8
    invoke-interface {p1, v0}, LZ/g;->u(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LZ/g;

    invoke-virtual {p0, p1}, Landroidx/room/d$a$b;->a(LZ/g;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
