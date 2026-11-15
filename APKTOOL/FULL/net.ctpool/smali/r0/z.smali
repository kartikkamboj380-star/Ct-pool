.class public final synthetic Lr0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lr0/A;

.field public final synthetic n:Landroidx/work/impl/utils/futures/c;


# direct methods
.method public synthetic constructor <init>(Lr0/A;Landroidx/work/impl/utils/futures/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/z;->m:Lr0/A;

    iput-object p2, p0, Lr0/z;->n:Landroidx/work/impl/utils/futures/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr0/z;->m:Lr0/A;

    iget-object v1, p0, Lr0/z;->n:Landroidx/work/impl/utils/futures/c;

    invoke-static {v0, v1}, Lr0/A;->a(Lr0/A;Landroidx/work/impl/utils/futures/c;)V

    return-void
.end method
