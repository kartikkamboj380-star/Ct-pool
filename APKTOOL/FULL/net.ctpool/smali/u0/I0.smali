.class public final synthetic Lu0/I0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/f;


# instance fields
.field public final synthetic a:Landroidx/concurrent/futures/c$a;

.field public final synthetic b:Landroidx/work/b;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroidx/concurrent/futures/c$a;Landroidx/work/b;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/I0;->a:Landroidx/concurrent/futures/c$a;

    iput-object p2, p0, Lu0/I0;->b:Landroidx/work/b;

    iput-object p3, p0, Lu0/I0;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lz3/l;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu0/I0;->a:Landroidx/concurrent/futures/c$a;

    iget-object v1, p0, Lu0/I0;->b:Landroidx/work/b;

    iget-object v2, p0, Lu0/I0;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lu0/R0;->p(Landroidx/concurrent/futures/c$a;Landroidx/work/b;Ljava/lang/String;Lz3/l;)V

    return-void
.end method
