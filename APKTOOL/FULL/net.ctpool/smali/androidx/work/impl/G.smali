.class public final synthetic Landroidx/work/impl/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Landroidx/work/impl/E;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Landroidx/work/impl/o;

.field public final synthetic p:Lv5/a;

.field public final synthetic q:Ll0/u;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/E;Ljava/lang/String;Landroidx/work/impl/o;Lv5/a;Ll0/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/G;->m:Landroidx/work/impl/E;

    iput-object p2, p0, Landroidx/work/impl/G;->n:Ljava/lang/String;

    iput-object p3, p0, Landroidx/work/impl/G;->o:Landroidx/work/impl/o;

    iput-object p4, p0, Landroidx/work/impl/G;->p:Lv5/a;

    iput-object p5, p0, Landroidx/work/impl/G;->q:Ll0/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/work/impl/G;->m:Landroidx/work/impl/E;

    iget-object v1, p0, Landroidx/work/impl/G;->n:Ljava/lang/String;

    iget-object v2, p0, Landroidx/work/impl/G;->o:Landroidx/work/impl/o;

    iget-object v3, p0, Landroidx/work/impl/G;->p:Lv5/a;

    iget-object v4, p0, Landroidx/work/impl/G;->q:Ll0/u;

    invoke-static {v0, v1, v2, v3, v4}, Landroidx/work/impl/I;->a(Landroidx/work/impl/E;Ljava/lang/String;Landroidx/work/impl/o;Lv5/a;Ll0/u;)V

    return-void
.end method
