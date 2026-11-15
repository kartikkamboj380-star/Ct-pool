.class public final synthetic Landroidx/work/impl/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Landroidx/work/impl/K;

.field public final synthetic n:LX3/d;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/K;LX3/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/J;->m:Landroidx/work/impl/K;

    iput-object p2, p0, Landroidx/work/impl/J;->n:LX3/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/work/impl/J;->m:Landroidx/work/impl/K;

    iget-object v1, p0, Landroidx/work/impl/J;->n:LX3/d;

    invoke-static {v0, v1}, Landroidx/work/impl/K;->a(Landroidx/work/impl/K;LX3/d;)V

    return-void
.end method
