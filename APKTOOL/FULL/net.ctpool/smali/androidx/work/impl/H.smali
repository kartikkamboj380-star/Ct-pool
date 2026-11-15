.class public final synthetic Landroidx/work/impl/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Landroidx/work/impl/WorkDatabase;

.field public final synthetic n:Lq0/u;

.field public final synthetic o:Lq0/u;

.field public final synthetic p:Ljava/util/List;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/util/Set;

.field public final synthetic s:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/WorkDatabase;Lq0/u;Lq0/u;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/H;->m:Landroidx/work/impl/WorkDatabase;

    iput-object p2, p0, Landroidx/work/impl/H;->n:Lq0/u;

    iput-object p3, p0, Landroidx/work/impl/H;->o:Lq0/u;

    iput-object p4, p0, Landroidx/work/impl/H;->p:Ljava/util/List;

    iput-object p5, p0, Landroidx/work/impl/H;->q:Ljava/lang/String;

    iput-object p6, p0, Landroidx/work/impl/H;->r:Ljava/util/Set;

    iput-boolean p7, p0, Landroidx/work/impl/H;->s:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/work/impl/H;->m:Landroidx/work/impl/WorkDatabase;

    iget-object v1, p0, Landroidx/work/impl/H;->n:Lq0/u;

    iget-object v2, p0, Landroidx/work/impl/H;->o:Lq0/u;

    iget-object v3, p0, Landroidx/work/impl/H;->p:Ljava/util/List;

    iget-object v4, p0, Landroidx/work/impl/H;->q:Ljava/lang/String;

    iget-object v5, p0, Landroidx/work/impl/H;->r:Ljava/util/Set;

    iget-boolean v6, p0, Landroidx/work/impl/H;->s:Z

    invoke-static/range {v0 .. v6}, Landroidx/work/impl/I;->b(Landroidx/work/impl/WorkDatabase;Lq0/u;Lq0/u;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V

    return-void
.end method
