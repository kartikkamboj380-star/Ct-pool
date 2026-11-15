.class public final synthetic Lu0/H0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/c;


# instance fields
.field public final synthetic a:Landroidx/work/b;

.field public final synthetic b:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/b;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/H0;->a:Landroidx/work/b;

    iput-object p2, p0, Lu0/H0;->b:Landroidx/concurrent/futures/c$a;

    return-void
.end method


# virtual methods
.method public final a(Lz3/l;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lu0/H0;->a:Landroidx/work/b;

    iget-object v1, p0, Lu0/H0;->b:Landroidx/concurrent/futures/c$a;

    invoke-static {v0, v1, p1}, Lu0/R0;->m(Landroidx/work/b;Landroidx/concurrent/futures/c$a;Lz3/l;)Lz3/l;

    move-result-object p1

    return-object p1
.end method
