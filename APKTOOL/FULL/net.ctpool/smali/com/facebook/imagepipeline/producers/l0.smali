.class public Lcom/facebook/imagepipeline/producers/l0;
.super Lcom/facebook/imagepipeline/producers/e;
.source "SourceFile"


# direct methods
.method public constructor <init>(LJ1/b;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 11

    .line 1
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->o()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v4

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->a()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->U()LJ1/b$c;

    move-result-object v6

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->l()Z

    move-result v7

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->J()Z

    move-result v8

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->b()Lx1/e;

    move-result-object v9

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->f()Ly1/m;

    move-result-object v10

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v10}, Lcom/facebook/imagepipeline/producers/l0;-><init>(LJ1/b;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/imagepipeline/producers/g0;Ljava/lang/Object;LJ1/b$c;ZZLx1/e;Ly1/m;)V

    return-void
.end method

.method public constructor <init>(LJ1/b;Ljava/lang/String;Lcom/facebook/imagepipeline/producers/g0;Ljava/lang/Object;LJ1/b$c;ZZLx1/e;Ly1/m;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p9}, Lcom/facebook/imagepipeline/producers/e;-><init>(LJ1/b;Ljava/lang/String;Lcom/facebook/imagepipeline/producers/g0;Ljava/lang/Object;LJ1/b$c;ZZLx1/e;Ly1/m;)V

    return-void
.end method

.method public constructor <init>(LJ1/b;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/imagepipeline/producers/g0;Ljava/lang/Object;LJ1/b$c;ZZLx1/e;Ly1/m;)V
    .locals 12

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    .line 3
    invoke-direct/range {v0 .. v11}, Lcom/facebook/imagepipeline/producers/e;-><init>(LJ1/b;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/facebook/imagepipeline/producers/g0;Ljava/lang/Object;LJ1/b$c;ZZLx1/e;Ly1/m;)V

    return-void
.end method
