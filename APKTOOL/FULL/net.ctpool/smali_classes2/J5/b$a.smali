.class final LJ5/b$a;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ5/b;-><init>(ILv5/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:LJ5/b;


# direct methods
.method constructor <init>(LJ5/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LJ5/b$a;->m:LJ5/b;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(LP5/a;Ljava/lang/Object;Ljava/lang/Object;)Lv5/l;
    .locals 1

    .line 1
    new-instance p2, LJ5/b$a$a;

    .line 2
    .line 3
    iget-object v0, p0, LJ5/b$a;->m:LJ5/b;

    .line 4
    .line 5
    invoke-direct {p2, p3, v0, p1}, LJ5/b$a$a;-><init>(Ljava/lang/Object;LJ5/b;LP5/a;)V

    .line 6
    .line 7
    .line 8
    return-object p2
.end method

.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-virtual {p0, p1, p2, p3}, LJ5/b$a;->a(LP5/a;Ljava/lang/Object;Ljava/lang/Object;)Lv5/l;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
