.class final LQ5/b$b;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ5/b;-><init>(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:LQ5/b;


# direct methods
.method constructor <init>(LQ5/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ5/b$b;->m:LQ5/b;

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
    .locals 0

    .line 1
    new-instance p1, LQ5/b$b$a;

    .line 2
    .line 3
    iget-object p3, p0, LQ5/b$b;->m:LQ5/b;

    .line 4
    .line 5
    invoke-direct {p1, p3, p2}, LQ5/b$b$a;-><init>(LQ5/b;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object p1
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
    invoke-virtual {p0, p1, p2, p3}, LQ5/b$b;->a(LP5/a;Ljava/lang/Object;Ljava/lang/Object;)Lv5/l;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
